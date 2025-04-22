package github.jcsmecabricks.customtorches.particle;

import github.jcsmecabricks.customtorches.CustomTorches;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {

    public static final SimpleParticleType RED_TORCH_PARTICLE =
            registerParticle("red_torch_particle", FabricParticleTypes.simple(true));

    public static final SimpleParticleType ORANGE_TORCH_PARTICLE =
            registerParticle("orange_torch_particle", FabricParticleTypes.simple(true));

    public static final SimpleParticleType YELLOW_TORCH_PARTICLE =
            registerParticle("yellow_torch_particle", FabricParticleTypes.simple(true));

    public static final SimpleParticleType GREEN_TORCH_PARTICLE =
            registerParticle("green_torch_particle", FabricParticleTypes.simple(true));


    public static final SimpleParticleType BLUE_TORCH_PARTICLE =
            registerParticle("blue_torch_particle", FabricParticleTypes.simple(true));

    public static final SimpleParticleType PURPLE_TORCH_PARTICLE =
            registerParticle("purple_torch_particle", FabricParticleTypes.simple(true));


    private static SimpleParticleType registerParticle(String name, SimpleParticleType particleType) {
        return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(CustomTorches.MOD_ID, name), particleType);
    }

    public static void loadParticles() {}
}
