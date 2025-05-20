package nl.delphinity.scrumcraft.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;
import nl.delphinity.scrumcraft.init.ModEntityTypes;
import nl.delphinity.scrumcraft.init.ModItems;

public class BallEntity extends ThrownItemEntity {

    public BallEntity(World world, LivingEntity owner, ItemStack stack) {
        super(ModEntityTypes.BALL_ENTITY, owner, world, stack);
    }

    public BallEntity(World world, double x, double y, double z, ItemStack stack) {
        super(ModEntityTypes.BALL_ENTITY, x, y, z, world, stack);
    }

    public BallEntity(EntityType<? extends BallEntity> type, World world) {
        super(type, world);
    }


    @Override
    protected Item getDefaultItem() {
        return ModItems.JONGLEER_BAL;
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        World world = this.getWorld();

        if(!world.isClient){
            this.kill((ServerWorld) world);
        }
    }
}
