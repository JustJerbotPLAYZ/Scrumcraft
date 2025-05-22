package nl.delphinity.scrumcraft.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class RensEntity extends AnimalEntity {
    public RensEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return false;
    }

    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add( 4, new WanderAroundFarGoal(this, 1d ));
        this.goalSelector.add( 5, new LookAtEntityGoal(this, PlayerEntity.class, 7f));
        this.goalSelector.add( 5, new LookAroundGoal(this));

    }
    public static DefaultAttributeContainer.Builder createRensAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.MAX_HEALTH, 20.0D)
                .add(EntityAttributes.MOVEMENT_SPEED, 0.3D)
                .add(EntityAttributes.ARMOR, 0.5f)
                .add(EntityAttributes.ATTACK_DAMAGE, 2);
    }
    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world,PassiveEntity entity) {
        return ModEntities.RENS.create(world);
    }
}
