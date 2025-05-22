package nl.delphinity.scrumcraft.common.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public class BrammekeEntity extends HostileEntity {
    public BrammekeEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createBrammekeAttributes() {
        return LivingEntity.createLivingAttributes().add(EntityAttributes.FOLLOW_RANGE, 16.0)
                .add(EntityAttributes.MAX_HEALTH, 10f)
                .add(EntityAttributes.ATTACK_DAMAGE, 1f)
                .add(EntityAttributes.ATTACK_SPEED, 2f)
                .add(EntityAttributes.TEMPT_RANGE, 16f);
    }
}
