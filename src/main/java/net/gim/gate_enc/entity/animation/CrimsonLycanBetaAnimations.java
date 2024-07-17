package net.gim.gate_enc.entity.animation;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;


public class CrimsonLycanBetaAnimations {
	public static final Animation CRIMSON_LYCAN_BETA_IDLE = Animation.Builder.create(1.25F).looping()
		.addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head_sections", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("ears", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("top_jaw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("bottom_jaw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("upper_torso", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.05F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("tail", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("tail_section3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("tail_subsection1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.build();

	public static final Animation CRIMSON_LYCAN_BETA_MELEE = Animation.Builder.create(1.0F)
		.addBoneAnimation("crimson_lycan_b", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 2.75F, -2.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("upper_body", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(14.335F, -4.4638F, 16.9384F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-13.165F, -4.4638F, 16.9384F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head_sections", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(12.3593F, -0.1211F, 7.5858F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-12.6407F, -0.1211F, 7.5858F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("ears", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("ears", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, -0.25F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("top_jaw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("bottom_jaw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5417F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("fore_legs", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("right_lower_fore_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("right_lowest_fore_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("right_fore_paw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("left_lower_fore_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("left_lowest_fore_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("left_fore_paw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lower_body", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hind_legs", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("right_lower_hind_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("right_hind_lowest_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("right_hind_paw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("left_hind_lower_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("left_hind_lowest_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("left_hind_paw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.build();

	public static final Animation CRIMSON_LYCAN_BETA_RUN = Animation.Builder.create(1.3333F).looping()
		.addBoneAnimation("crimson_lycan", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-11.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(-11.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("crimson_lycan", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 2.29F, -1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, 3.0F, -1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 2.29F, -1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.94F, -1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 2.29F, -1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createTranslationalVector(0.0F, 3.0F, -1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createTranslationalVector(0.0F, 0.94F, -1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 2.29F, -1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("upper_body", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(11.67F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(11.67F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(11.67F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(11.67F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(8.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(8.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0417F, AnimationHelper.createRotationalVector(8.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(-22.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("head_sections", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0417F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(-12.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("ears", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("top_jaw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0417F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("bottom_jaw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.0417F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("fore_legs", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-18.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-18.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-18.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(-55.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(-18.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("fore_legs", new Transformation(Transformation.Targets.TRANSLATE, 
			new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.94F, -1.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("right_fore_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-3.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-3.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-3.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(-3.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("right_lower_fore_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("right_lowest_fore_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(8.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(8.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(8.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(-32.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(8.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("right_fore_paw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(3.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(3.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(3.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(3.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("left_fore_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("left_lower_fore_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("left_fore_thigh", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("left_lowest_fore_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(8.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(8.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(8.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(17.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(-25.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(8.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("left_fore_paw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(6.67F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(6.67F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(6.67F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(6.67F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("lower_body", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-8.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-8.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-8.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(-8.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("hind_legs", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("right_hind_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(13.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(13.61F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(13.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(13.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(35.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(13.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("right_lower_hind_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("right_hind_lowest_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(-8.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(-7.33F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(-8.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(-8.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(-10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(-8.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("right_hind_paw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(6.67F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("left_hind_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(16.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(5.27F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(14.67F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createRotationalVector(16.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(16.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(5.27F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(16.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("left_hind_lower_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("left_hind_lowest_leg", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(10.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("left_hind_paw", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.4583F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.75F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(-15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("tail", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(27.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(-20.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("tail_subsection1", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(-30.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.addBoneAnimation("tail_section3", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.625F, AnimationHelper.createRotationalVector(-37.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.9583F, AnimationHelper.createRotationalVector(7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.2083F, AnimationHelper.createRotationalVector(-37.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.build();
}