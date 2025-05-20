package nl.delphinity.scrumcraft.common.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import nl.delphinity.scrumcraft.common.entity.BallEntity;
import nl.delphinity.scrumcraft.common.entity.RubberDuckyEntity;
import nl.delphinity.scrumcraft.init.ModSounds;

public class Ball extends Item {

    public Ball(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);

        world.playSound(null, user.getX(), user.getY(), user.getZ(), ModSounds.BALL_THROW, SoundCategory.PLAYERS, 0.5f, 1F);

        if(!world.isClient) {
            this.throwBall((ServerWorld) world, user, itemStack, 1f, 1f);
        }

        user.incrementStat(Stats.USED.getOrCreateStat(this));
        itemStack.decrementUnlessCreative(1, user);
        return ActionResult.CONSUME;
    }

    public BallEntity throwBall(ServerWorld world, PlayerEntity user, ItemStack stack, float throwingPower, float divergence){
        return ProjectileEntity.spawnWithVelocity(
                BallEntity::new,
                world,
                stack,
                user,
                0.0F,
                throwingPower,
                divergence);
    }
}
