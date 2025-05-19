package nl.delphinity.scrumcraft.common.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import nl.delphinity.scrumcraft.common.entity.RubberDuckyEntity;
import nl.delphinity.scrumcraft.init.ModSounds;

public class RubberDucky extends Item {

    public RubberDucky(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(), ModSounds.RUBBER_DUCKY_THROW, SoundCategory.PLAYERS, 0.5F, 1F);

        if(!world.isClient) {

        }

        user.incrementStat(Stats.USED.getOrCreateStat(this));
        itemStack.decrementUnlessCreative(1, user);
        return ActionResult.CONSUME;
    }

    public RubberDuckyEntity throwDuck(ServerWorld world, PlayerEntity user, ItemStack stack, float throwingPower, float divergence) {
        return ProjectileEntity.spawnWithVelocity(
                RubberDuckyEntity::new,
                world,
                stack,
                user,
                0.0F,
                throwingPower,
                divergence);
    }
}
