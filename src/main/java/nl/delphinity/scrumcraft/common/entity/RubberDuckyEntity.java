package nl.delphinity.scrumcraft.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;
import nl.delphinity.scrumcraft.init.ModEntityTypes;
import nl.delphinity.scrumcraft.init.ModItems;
import nl.delphinity.scrumcraft.init.ModSounds;

public class RubberDuckyEntity extends ThrownItemEntity {



    public RubberDuckyEntity(World world, LivingEntity owner, ItemStack stack) {
        super(ModEntityTypes.RUBBER_DUCKY_ENTITY, owner, world, stack);
    }

    public RubberDuckyEntity(World world, double x, double y, double z, ItemStack stack) {
        super(ModEntityTypes.RUBBER_DUCKY_ENTITY, x, y, z, world, stack);
    }

    public RubberDuckyEntity(EntityType<? extends RubberDuckyEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        World world = this.getWorld();

        world.playSound(null, this.getX(), this.getY(), this.getZ(), ModSounds.RUBBER_DUCKY_SQUEAK, SoundCategory.PLAYERS, 0.5F, 1F);

        if(!world.isClient) {
            this.kill((ServerWorld) world);
        }
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.RUBBER_DUCKY;
    }
}
