package github.jcsmecabricks.customtorches.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.FabricSpriteProvider;
import net.minecraft.client.particle.AbstractSlowingParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.ParticleTextureSheet;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import org.jetbrains.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class TorchParticles extends AbstractSlowingParticle {
    private final Sprite sprite;

    public TorchParticles(ClientWorld world, double x, double y, double z,
                          double velocityX, double velocityY, double velocityZ, Sprite sprite) {
        super(world, x, y, z, velocityX, velocityY, velocityZ, sprite);
        this.sprite = sprite;
    }

    @Override
    public void move(double dx, double dy, double dz) {
        this.setBoundingBox(this.getBoundingBox().offset(dx, dy, dz));
        this.repositionFromBoundingBox();
    }

    @Override
    public float getSize(float tickProgress) {
        float f = (this.age + tickProgress) / this.maxAge;
        return this.scale * (1.0F - f * f * 0.5F);
    }

    @Override
    public int getBrightness(float tint) {
        float f = (this.age + tint) / this.maxAge;
        f = MathHelper.clamp(f, 0.0F, 1.0F);
        int baseBrightness = super.getBrightness(tint);
        int blockLight = baseBrightness & 0xFF;
        int skyLight = (baseBrightness >> 16) & 0xFF;
        blockLight += (int)(f * 15.0F * 16.0F);
        if (blockLight > 240) blockLight = 240;
        return blockLight | (skyLight << 16);
    }

    @Override
    public ParticleTextureSheet textureSheet() {
        return ParticleTextureSheet.SINGLE_QUADS;
    }

    @Override
    protected RenderType getRenderType() {
        return RenderType.PARTICLE_ATLAS_OPAQUE;
    }

    // Factory class for creating TorchParticles
    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<SimpleParticleType> {
        private final FabricSpriteProvider spriteProvider;

        public Factory(FabricSpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public @Nullable Particle createParticle(SimpleParticleType parameters, ClientWorld world,
                                                 double x, double y, double z,
                                                 double velocityX, double velocityY, double velocityZ,
                                                 Random random) {
            Sprite sprite = this.spriteProvider.getSprite(random);
            return new TorchParticles(world, x, y, z, velocityX, velocityY, velocityZ, sprite);
        }
    }

    // Optional: Smaller variant (can be extended if needed)
    @Environment(EnvType.CLIENT)
    public static abstract class SmallFactory implements ParticleFactory<SimpleParticleType> {
        private final FabricSpriteProvider spriteProvider;

        public SmallFactory(FabricSpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(SimpleParticleType type, ClientWorld world,
                                       double x, double y, double z,
                                       double velocityX, double velocityY, double velocityZ,
                                       Random random) {
            Sprite sprite = this.spriteProvider.getSprite(random);
            TorchParticles particle = new TorchParticles(world, x, y, z, velocityX, velocityY, velocityZ, sprite);
            particle.scale(0.5F);
            return particle;
        }
    }
}
