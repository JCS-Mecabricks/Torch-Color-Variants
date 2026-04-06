package github.jcsmecabricks.customtorches;

import github.jcsmecabricks.customtorches.particle.TorchParticles;
import github.jcsmecabricks.customtorches.particle.ModParticles;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleProviderRegistry;

public class CustomTorchesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleProviderRegistry.getInstance().register(ModParticles.RED_TORCH_PARTICLE, TorchParticles.Provider::new);
        ParticleProviderRegistry.getInstance().register(ModParticles.BLUE_TORCH_PARTICLE, TorchParticles.Provider::new);
        ParticleProviderRegistry.getInstance().register(ModParticles.ORANGE_TORCH_PARTICLE, TorchParticles.Provider::new);
        ParticleProviderRegistry.getInstance().register(ModParticles.YELLOW_TORCH_PARTICLE, TorchParticles.Provider::new);
        ParticleProviderRegistry.getInstance().register(ModParticles.GREEN_TORCH_PARTICLE, TorchParticles.Provider::new);
        ParticleProviderRegistry.getInstance().register(ModParticles.PURPLE_TORCH_PARTICLE, TorchParticles.Provider::new);
    }
}
