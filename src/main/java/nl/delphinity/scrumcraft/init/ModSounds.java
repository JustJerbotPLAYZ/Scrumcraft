package nl.delphinity.scrumcraft.init;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import nl.delphinity.scrumcraft.Scrumcraft;

public class ModSounds {

    public static final SoundEvent RUBBER_DUCKY_SQUEAK = registerSound("rubber_ducky_squeak");
    public static final SoundEvent RUBBER_DUCKY_THROW = registerSound("rubber_ducky_throw");
    public static final SoundEvent BALL_HIT = registerSound("ball_hit");

    public static void init() {

    }

    private static SoundEvent registerSound(String id) {
        Identifier identifier = Identifier.of(Scrumcraft.MOD_ID, id);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }
}
