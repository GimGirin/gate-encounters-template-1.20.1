package net.gim.gate_enc.entity.client.crimson_lycan;

import net.gim.gate_enc.entity.animation.CrimsonLycanBetaAnimations;
import net.gim.gate_enc.entity.animation.CrimsonLycanAnimations;
import net.gim.gate_enc.entity.custom.crimson_lycan.CrimsonLycanEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class CrimsonLycanBetaModel<T extends CrimsonLycanEntity> extends SinglePartEntityModel<T> {

	private final ModelPart crimson_lycan_model;
	private final ModelPart crimson_lycan_b;
	private final ModelPart upper_body;
	private final ModelPart head;
	private final ModelPart neck;
	private final ModelPart head_sections;
	private final ModelPart back_head;
	private final ModelPart ears;
	private final ModelPart front_head;
	private final ModelPart jaws;
	private final ModelPart top_jaw;
	private final ModelPart bottom_jaw;
	private final ModelPart steel_jaw;
	private final ModelPart fore_legs;
	private final ModelPart right_fore_leg;
	private final ModelPart right_fore_hip;
	private final ModelPart right_lower_fore_leg;
	private final ModelPart right_fore_thigh;
	private final ModelPart right_lowest_fore_leg;
	private final ModelPart right_fore_ankle;
	private final ModelPart right_fore_paw;
	private final ModelPart left_fore_leg;
	private final ModelPart left_fore_hip;
	private final ModelPart left_lower_fore_leg;
	private final ModelPart left_fore_thigh;
	private final ModelPart left_lowest_fore_leg;
	private final ModelPart left_fore_ankle;
	private final ModelPart left_fore_paw;
	private final ModelPart upper_torso;
	private final ModelPart lower_body;
	private final ModelPart lower_torso;
	private final ModelPart hind_legs;
	private final ModelPart right_hind_leg;
	private final ModelPart right_hind_hip;
	private final ModelPart right_lower_hind_leg;
	private final ModelPart right_hind_thigh;
	private final ModelPart right_hind_lowest_leg;
	private final ModelPart right_hind_ankle;
	private final ModelPart right_hind_paw;
	private final ModelPart left_hind_leg;
	private final ModelPart left_hind_hip;
	private final ModelPart left_hind_lower_leg;
	private final ModelPart left_hind_thigh;
	private final ModelPart left_hind_lowest_leg;
	private final ModelPart left_hind_ankle;
	private final ModelPart left_hind_paw;
	private final ModelPart tail;
	private final ModelPart tail_section1;
	private final ModelPart tail_subsection1;
	private final ModelPart tail_section2;
	private final ModelPart tail_section3;

	public CrimsonLycanBetaModel(ModelPart root) {
		this.crimson_lycan_model = root.getChild("crimson_lycan_model");
		this.crimson_lycan_b = this.crimson_lycan_model.getChild("crimson_lycan_b");
		this.upper_body = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body");
		this.head = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("head");
		this.neck = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("head").
				getChild("neck");
		this.head_sections = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("head").
				getChild("head_sections");
		this.back_head = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("head").
				getChild("head_sections").getChild("back_head");
		this.ears = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("head").
				getChild("head_sections").getChild("back_head").getChild("ears");
		this.front_head = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("head").
				getChild("head_sections").getChild("front_head");
		this.jaws = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("head").
				getChild("head_sections").getChild("front_head").getChild("jaws");
		this.top_jaw = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("head").
				getChild("head_sections").getChild("front_head").getChild("jaws").getChild("top_jaw");
		this.bottom_jaw = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("head").
				getChild("head_sections").getChild("front_head").getChild("jaws").getChild("bottom_jaw");
		this.steel_jaw = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("head").
				getChild("head_sections").getChild("front_head").getChild("jaws").getChild("bottom_jaw").getChild("steel_jaw");
		this.fore_legs = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("fore_legs");
		this.right_fore_leg = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("fore_legs").
				getChild("right_fore_leg");
		this.right_fore_hip = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("fore_legs").
				getChild("right_fore_leg").getChild("right_fore_hip");
		this.right_lower_fore_leg = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("fore_legs").
				getChild("right_fore_leg").getChild("right_lower_fore_leg");
		this.right_fore_thigh = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("fore_legs").
				getChild("right_fore_leg").getChild("right_lower_fore_leg").getChild("right_fore_thigh");
		this.right_lowest_fore_leg = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("fore_legs").
				getChild("right_fore_leg").getChild("right_lower_fore_leg").getChild("right_lowest_fore_leg");
		this.right_fore_ankle = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("fore_legs").
				getChild("right_fore_leg").getChild("right_lower_fore_leg").getChild("right_lowest_fore_leg").getChild("right_fore_ankle");
		this.right_fore_paw = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("fore_legs").
				getChild("right_fore_leg").getChild("right_lower_fore_leg").getChild("right_lowest_fore_leg").getChild("right_fore_paw");
		this.left_fore_leg = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("fore_legs").
				getChild("left_fore_leg");
		this.left_fore_hip = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("fore_legs").
				getChild("left_fore_leg").getChild("left_fore_hip");
		this.left_lower_fore_leg = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("fore_legs").
				getChild("left_fore_leg").getChild("left_lower_fore_leg");
		this.left_fore_thigh = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("fore_legs").
				getChild("left_fore_leg").getChild("left_lower_fore_leg").getChild("left_fore_thigh");
		this.left_lowest_fore_leg = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("fore_legs").
				getChild("left_fore_leg").getChild("left_lower_fore_leg").getChild("left_lowest_fore_leg");
		this.left_fore_ankle = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("fore_legs").
				getChild("left_fore_leg").getChild("left_lower_fore_leg").getChild("left_lowest_fore_leg").getChild("left_fore_ankle");
		this.left_fore_paw = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("fore_legs").
				getChild("left_fore_leg").getChild("left_lower_fore_leg").getChild("left_lowest_fore_leg").getChild("left_fore_paw");
		this.upper_torso = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("upper_body").getChild("upper_torso");
		this.lower_body = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body");
		this.lower_torso = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("lower_torso");
		this.hind_legs = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("hind_legs");
		this.right_hind_leg = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("hind_legs").
				getChild("right_hind_leg");
		this.right_hind_hip = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("hind_legs").
				getChild("right_hind_leg").getChild("right_hind_hip");
		this.right_lower_hind_leg = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("hind_legs").
				getChild("right_hind_leg").getChild("right_lower_hind_leg");
		this.right_hind_thigh = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("hind_legs").
				getChild("right_hind_leg").getChild("right_lower_hind_leg").getChild("right_hind_thigh");
		this.right_hind_lowest_leg = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("hind_legs").
				getChild("right_hind_leg").getChild("right_lower_hind_leg").getChild("right_hind_lowest_leg");
		this.right_hind_ankle = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("hind_legs").
				getChild("right_hind_leg").getChild("right_lower_hind_leg").getChild("right_hind_lowest_leg").getChild("right_hind_ankle");
		this.right_hind_paw = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("hind_legs").
				getChild("right_hind_leg").getChild("right_lower_hind_leg").getChild("right_hind_lowest_leg").getChild("right_hind_paw");
		this.left_hind_leg = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("hind_legs").
				getChild("left_hind_leg");
		this.left_hind_hip = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("hind_legs").
				getChild("left_hind_leg").getChild("left_hind_hip");
		this.left_hind_lower_leg = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("hind_legs").
				getChild("left_hind_leg").getChild("left_hind_lower_leg");
		this.left_hind_thigh = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("hind_legs").
				getChild("left_hind_leg").getChild("left_hind_lower_leg").getChild("left_hind_thigh");
		this.left_hind_lowest_leg = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("hind_legs").
				getChild("left_hind_leg").getChild("left_hind_lower_leg").getChild("left_hind_lowest_leg");
		this.left_hind_ankle = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("hind_legs").
				getChild("left_hind_leg").getChild("left_hind_lower_leg").getChild("left_hind_lowest_leg").getChild("left_hind_ankle");
		this.left_hind_paw = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("hind_legs").
				getChild("left_hind_leg").getChild("left_hind_lower_leg").getChild("left_hind_lowest_leg").getChild("left_hind_paw");
		this.tail = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("tail");
		this.tail_section1 = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("tail").
				getChild("tail_section1");
		this.tail_subsection1 = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("tail").
				getChild("tail_subsection1");
		this.tail_section2 = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("tail").
				getChild("tail_subsection1").getChild("tail_section2");
		this.tail_section3 = this.crimson_lycan_model.getChild("crimson_lycan_b").getChild("lower_body").getChild("tail").
				getChild("tail_subsection1").getChild("tail_section3");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData crimson_lycan_model = modelPartData.addChild("crimson_lycan_model", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData crimson_lycan_b = crimson_lycan_model.addChild("crimson_lycan_b", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -9.5F, 0.0F));

		ModelPartData upper_body = crimson_lycan_b.addChild("upper_body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = upper_body.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -2.75F, -8.0F));

		ModelPartData neck = head.addChild("neck", ModelPartBuilder.create().uv(42, 0).cuboid(-1.5F, -1.625F, -3.0F, 3.0F, 3.25F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.375F, 0.0F));

		ModelPartData head_sections = head.addChild("head_sections", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, -2.0F));

		ModelPartData back_head = head_sections.addChild("back_head", ModelPartBuilder.create().uv(0, 31).cuboid(-2.5F, -2.25F, -4.0F, 5.0F, 4.5F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData ears = back_head.addChild("ears", ModelPartBuilder.create(), ModelTransform.of(0.0F, -1.6906F, -0.4163F, -0.0873F, 0.0F, 0.0F));

		ModelPartData right_ear_tip_r1 = ears.addChild("right_ear_tip_r1", ModelPartBuilder.create().uv(7, 7).cuboid(-0.25F, -2.25F, -0.75F, 0.5F, 2.5F, 1.25F, new Dilation(0.0F))
		.uv(25, 16).cuboid(4.25F, -2.25F, -0.75F, 0.5F, 2.5F, 1.25F, new Dilation(0.0F)), ModelTransform.of(-2.25F, -1.2594F, 0.1163F, -0.2618F, 0.0F, 0.0F));

		ModelPartData right_ear_base_r1 = ears.addChild("right_ear_base_r1", ModelPartBuilder.create().uv(0, 43).cuboid(-0.5F, -1.0F, -0.75F, 1.0F, 2.25F, 1.75F, new Dilation(0.0F))
		.uv(6, 43).cuboid(4.0F, -1.0F, -0.75F, 1.0F, 2.25F, 1.75F, new Dilation(0.0F)), ModelTransform.of(-2.25F, -1.2594F, -0.3837F, -0.2618F, 0.0F, 0.0F));

		ModelPartData front_head = head_sections.addChild("front_head", ModelPartBuilder.create().uv(0, 48).cuboid(-2.0F, -1.75F, -5.0F, 4.0F, 3.5F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.25F, 0.0F));

		ModelPartData jaws = front_head.addChild("jaws", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.25F, -5.0F));

		ModelPartData top_jaw = jaws.addChild("top_jaw", ModelPartBuilder.create().uv(0, 54).cuboid(-1.25F, -0.25F, -2.5F, 2.5F, 1.0F, 3.5F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.5F, 0.0F));

		ModelPartData bottom_jaw = jaws.addChild("bottom_jaw", ModelPartBuilder.create().uv(1, 59).cuboid(-1.0F, 0.5F, -2.75F, 2.0F, 1.0F, 3.25F, new Dilation(0.0F))
		.uv(-3, 64).cuboid(-1.0F, 1.5F, -2.75F, 2.0F, 0.0F, 3.25F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.25F, 0.5F));

		ModelPartData steel_jaw = bottom_jaw.addChild("steel_jaw", ModelPartBuilder.create().uv(116, 0).cuboid(-2.0F, -4.25F, -1.5F, 2.5F, 1.25F, 3.5F, new Dilation(0.0F))
		.uv(118, 0).cuboid(-2.0F, -4.5F, 0.25F, 0.25F, 0.25F, 0.25F, new Dilation(0.0F))
		.uv(117, 0).cuboid(-2.0F, -4.5F, -0.25F, 0.25F, 0.25F, 0.25F, new Dilation(0.0F))
		.uv(116, 0).cuboid(-2.0F, -4.5F, -1.5F, 0.25F, 0.25F, 0.25F, new Dilation(0.0F))
		.uv(115, 0).cuboid(0.25F, -4.5F, -1.5F, 0.25F, 0.25F, 0.25F, new Dilation(0.0F))
		.uv(114, 0).cuboid(-0.5F, -4.5F, -1.5F, 0.25F, 0.25F, 0.25F, new Dilation(0.0F))
		.uv(113, 0).cuboid(-1.25F, -4.5F, -1.5F, 0.25F, 0.25F, 0.25F, new Dilation(0.0F))
		.uv(112, 0).cuboid(-2.0F, -4.5F, 0.75F, 0.25F, 0.25F, 0.25F, new Dilation(0.0F))
		.uv(111, 0).cuboid(0.25F, -4.5F, 0.75F, 0.25F, 0.25F, 0.25F, new Dilation(0.0F))
		.uv(110, 0).cuboid(0.25F, -4.5F, -0.25F, 0.25F, 0.25F, 0.25F, new Dilation(0.0F))
		.uv(109, 0).cuboid(0.25F, -4.5F, 0.25F, 0.25F, 0.25F, 0.25F, new Dilation(0.0F)), ModelTransform.pivot(0.75F, 5.25F, -1.5F));

		ModelPartData fore_legs = upper_body.addChild("fore_legs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -1.5F, -6.75F));

		ModelPartData right_fore_leg = fore_legs.addChild("right_fore_leg", ModelPartBuilder.create(), ModelTransform.of(-3.5F, -0.25F, -0.25F, 0.1745F, 0.0F, 0.0F));

		ModelPartData right_fore_hip = right_fore_leg.addChild("right_fore_hip", ModelPartBuilder.create().uv(29, 37).cuboid(0.0F, -3.0F, -5.0F, 3.0F, 4.75F, 4.5F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, 1.0F, 3.0F));

		ModelPartData right_lower_fore_leg = right_fore_leg.addChild("right_lower_fore_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 3.75F, -0.5F));

		ModelPartData right_fore_thigh = right_lower_fore_leg.addChild("right_fore_thigh", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 1.0F));

		ModelPartData right_fore_thigh_r1 = right_fore_thigh.addChild("right_fore_thigh_r1", ModelPartBuilder.create().uv(28, 47).cuboid(-1.0F, -2.25F, -1.5F, 2.0F, 6.5F, 3.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		ModelPartData right_lowest_fore_leg = right_lower_fore_leg.addChild("right_lowest_fore_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 4.0F, 1.75F));

		ModelPartData right_fore_ankle = right_lowest_fore_leg.addChild("right_fore_ankle", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.5F, -0.75F));

		ModelPartData right_fore_le_r1 = right_fore_ankle.addChild("right_fore_le_r1", ModelPartBuilder.create().uv(1, 77).cuboid(-0.5F, -2.3479F, -0.2564F, 1.0F, 5.0F, 2.25F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -0.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData right_fore_paw = right_lowest_fore_leg.addChild("right_fore_paw", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 3.0058F, -0.7192F));

		ModelPartData right_fore_paw_r1 = right_fore_paw.addChild("right_fore_paw_r1", ModelPartBuilder.create().uv(3, 80).cuboid(-4.0F, 0.5F, 0.5F, 2.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -1.5058F, -4.0308F, -0.1745F, 0.0F, 0.0F));

		ModelPartData left_fore_leg = fore_legs.addChild("left_fore_leg", ModelPartBuilder.create(), ModelTransform.of(3.5F, -0.25F, -0.25F, 0.1745F, 0.0F, 0.0F));

		ModelPartData left_fore_hip = left_fore_leg.addChild("left_fore_hip", ModelPartBuilder.create().uv(18, 32).cuboid(0.0F, -3.0F, -5.0F, 3.0F, 4.75F, 4.5F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, 1.0F, 3.0F));

		ModelPartData left_lower_fore_leg = left_fore_leg.addChild("left_lower_fore_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 3.75F, -0.5F));

		ModelPartData left_fore_thigh = left_lower_fore_leg.addChild("left_fore_thigh", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 1.0F));

		ModelPartData left_fore_thigh_r1 = left_fore_thigh.addChild("left_fore_thigh_r1", ModelPartBuilder.create().uv(45, 7).cuboid(-1.0F, -2.25F, -1.5F, 2.0F, 6.5F, 3.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		ModelPartData left_lowest_fore_leg = left_lower_fore_leg.addChild("left_lowest_fore_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 4.0F, 1.75F));

		ModelPartData left_fore_ankle = left_lowest_fore_leg.addChild("left_fore_ankle", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.5F, -0.75F));

		ModelPartData left_fore_le_r1 = left_fore_ankle.addChild("left_fore_le_r1", ModelPartBuilder.create().uv(15, 77).cuboid(-0.5F, -2.3479F, -0.2564F, 1.0F, 5.0F, 2.25F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -0.25F, -0.3054F, 0.0F, 0.0F));

		ModelPartData left_fore_paw = left_lowest_fore_leg.addChild("left_fore_paw", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 3.0058F, -0.7192F));

		ModelPartData left_fore_paw_r1 = left_fore_paw.addChild("left_fore_paw_r1", ModelPartBuilder.create().uv(17, 80).cuboid(-4.0F, 0.5F, 0.5F, 2.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -1.5058F, -4.0308F, -0.1745F, 0.0F, 0.0F));

		ModelPartData upper_torso = upper_body.addChild("upper_torso", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -5.0F, -8.0F, 8.0F, 6.25F, 9.0F, new Dilation(0.0F))
		.uv(40, 22).cuboid(-4.0F, -5.0F, 1.0F, 8.0F, 6.25F, 0.25F, new Dilation(0.0F))
		.uv(23, 0).cuboid(-3.0F, -6.0F, -7.0F, 6.0F, 4.25F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData lower_body = crimson_lycan_b.addChild("lower_body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData lower_torso = lower_body.addChild("lower_torso", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -4.0F, -10.0F, 6.0F, 5.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 7.0F));

		ModelPartData hind_legs = lower_body.addChild("hind_legs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -2.0F, 7.0F));

		ModelPartData right_hind_leg = hind_legs.addChild("right_hind_leg", ModelPartBuilder.create(), ModelTransform.of(-2.5F, 0.25F, 0.0F, 0.1745F, 0.0F, 0.0F));

		ModelPartData right_hind_hip = right_hind_leg.addChild("right_hind_hip", ModelPartBuilder.create().uv(29, 26).cuboid(0.0F, -4.0F, -5.5F, 3.0F, 5.75F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, 1.0F, 3.0F));

		ModelPartData right_lower_hind_leg = right_hind_leg.addChild("right_lower_hind_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 3.75F, -0.5F));

		ModelPartData right_hind_thigh = right_lower_hind_leg.addChild("right_hind_thigh", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 1.0F));

		ModelPartData right_hind_thigh_r1 = right_hind_thigh.addChild("right_hind_thigh_r1", ModelPartBuilder.create().uv(41, 43).cuboid(-1.0F, -3.25F, -2.0F, 2.0F, 7.5F, 3.75F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		ModelPartData right_hind_lowest_leg = right_lower_hind_leg.addChild("right_hind_lowest_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 4.0F, 1.5F));

		ModelPartData right_hind_ankle = right_hind_lowest_leg.addChild("right_hind_ankle", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.5F, -0.5F));

		ModelPartData right_hind_leg_r1 = right_hind_ankle.addChild("right_hind_leg_r1", ModelPartBuilder.create().uv(0, 68).cuboid(-0.5F, -2.1302F, -0.7614F, 1.0F, 4.5F, 2.75F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -0.25F, -0.3491F, 0.0F, 0.0F));

		ModelPartData right_hind_paw = right_hind_lowest_leg.addChild("right_hind_paw", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 2.5F, -1.0F));

		ModelPartData right_hind_paw_r1 = right_hind_paw.addChild("right_hind_paw_r1", ModelPartBuilder.create().uv(3, 71).cuboid(-4.0F, 0.5F, 0.5F, 2.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -1.0F, -3.5F, -0.1745F, 0.0F, 0.0F));

		ModelPartData left_hind_leg = hind_legs.addChild("left_hind_leg", ModelPartBuilder.create(), ModelTransform.of(2.5F, 0.25F, 0.0F, 0.1745F, 0.0F, 0.0F));

		ModelPartData left_hind_hip = left_hind_leg.addChild("left_hind_hip", ModelPartBuilder.create().uv(29, 11).cuboid(0.0F, -4.0F, -5.5F, 3.0F, 5.75F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, 1.0F, 3.0F));

		ModelPartData left_hind_lower_leg = left_hind_leg.addChild("left_hind_lower_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 3.75F, -0.5F));

		ModelPartData left_hind_thigh = left_hind_lower_leg.addChild("left_hind_thigh", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 1.0F));

		ModelPartData left_hind_thigh_r1 = left_hind_thigh.addChild("left_hind_thigh_r1", ModelPartBuilder.create().uv(16, 42).cuboid(-1.0F, -3.25F, -2.0F, 2.0F, 7.5F, 3.75F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		ModelPartData left_hind_lowest_leg = left_hind_lower_leg.addChild("left_hind_lowest_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 4.0F, 1.5F));

		ModelPartData left_hind_ankle = left_hind_lowest_leg.addChild("left_hind_ankle", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.5F, -0.5F));

		ModelPartData left_hind_leg_r1 = left_hind_ankle.addChild("left_hind_leg_r1", ModelPartBuilder.create().uv(14, 68).cuboid(-0.5F, -2.1302F, -0.7614F, 1.0F, 4.5F, 2.75F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -0.25F, -0.3491F, 0.0F, 0.0F));

		ModelPartData left_hind_paw = left_hind_lowest_leg.addChild("left_hind_paw", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 2.5F, -1.0F));

		ModelPartData left_hind_paw_r1 = left_hind_paw.addChild("left_hind_paw_r1", ModelPartBuilder.create().uv(17, 71).cuboid(-4.0F, 0.5F, 0.5F, 2.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -1.0F, -3.5F, -0.1745F, 0.0F, 0.0F));

		ModelPartData tail = lower_body.addChild("tail", ModelPartBuilder.create(), ModelTransform.of(0.0F, -2.0F, 8.0F, -0.4363F, 0.0F, 0.0F));

		ModelPartData tail_section1 = tail.addChild("tail_section1", ModelPartBuilder.create().uv(9, 50).cuboid(-0.5F, -0.9642F, -0.8991F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.0358F, -0.1009F));

		ModelPartData tail_subsection1 = tail.addChild("tail_subsection1", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 2.25F, 0.2618F, 0.0F, 0.0F));

		ModelPartData tail_section2 = tail_subsection1.addChild("tail_section2", ModelPartBuilder.create().uv(40, 32).cuboid(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData tail_section3 = tail_subsection1.addChild("tail_section3", ModelPartBuilder.create().uv(16, 59).cuboid(-1.25F, -1.75F, 0.0F, 2.5F, 3.5F, 5.0F, new Dilation(0.0F))
		.uv(13, 59).cuboid(-0.75F, -1.25F, 4.0F, 1.5F, 2.5F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 4.0F, 0.3491F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(CrimsonLycanEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(CrimsonLycanBetaAnimations.CRIMSON_LYCAN_BETA_RUN, limbSwing, limbSwingAmount, 2F, 2.5F);
		this.updateAnimation(entity.idleAnimationState, CrimsonLycanBetaAnimations.CRIMSON_LYCAN_BETA_IDLE, ageInTicks, 1F);
		this.updateAnimation(entity.attackAnimationState, CrimsonLycanBetaAnimations.CRIMSON_LYCAN_BETA_MELEE, ageInTicks, 1F);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float Beta) {
		crimson_lycan_model.render(matrices, vertexConsumer, light, overlay, red, green, blue, Beta);
	}

	@Override
	public ModelPart getPart() {
		return crimson_lycan_model;
	}
}