package github.jcsmecabricks.customtorches;

import github.jcsmecabricks.customtorches.particle.TorchParticles;
import github.jcsmecabricks.customtorches.particle.ModParticles;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

public class CustomTorchesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(ModParticles.RED_TORCH_PARTICLE, TorchParticles.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.BLUE_TORCH_PARTICLE, TorchParticles.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.ORANGE_TORCH_PARTICLE, TorchParticles.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.YELLOW_TORCH_PARTICLE, TorchParticles.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.GREEN_TORCH_PARTICLE, TorchParticles.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.PURPLE_TORCH_PARTICLE, TorchParticles.Factory::new);
    }
}
