package net.gim.gate_enc.entity.custom.crimson_lycan;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class CrimsonLycanGammaEntity extends CrimsonLycanEntity {
    public CrimsonLycanGammaEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createCrimsonLycanGammaAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 15)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 17)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.24F)
                .add(EntityAttributes.GENERIC_ARMOR, 0.4F)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 12.0F);
    }
}
