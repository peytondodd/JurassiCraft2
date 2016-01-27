package org.jurassicraft.server.dinosaur;

import org.jurassicraft.server.entity.ZhenyuanopterusEntity;
import org.jurassicraft.server.entity.base.EnumDiet;
import org.jurassicraft.server.period.EnumTimePeriod;

public class ZhenyuanopterusDinosaur extends Dinosaur
{
    public ZhenyuanopterusDinosaur()
    {
        super();

        this.setName("Zhenyuanopterus");
        this.setDinosaurClass(ZhenyuanopterusEntity.class);
        this.setTimePeriod(EnumTimePeriod.CRETACEOUS);
        this.setEggColorMale(0x434F4E, 0x0F1010);
        this.setEggColorFemale(0x4A5957, 0xB9B7A3);
        this.setHealth(16, 55);
        this.setSpeed(0.46, 0.40);
        this.setStrength(6, 36);
        this.setMaximumAge(fromDays(40));
        this.setEyeHeight(0.225F, 1.3F);
        this.setSizeX(0.3F, 1.0F);
        this.setSizeY(0.3F, 1.3F);
        this.setStorage(27);
        this.setDiet(EnumDiet.CARNIVORE);
        this.setBones("leg_bones", "pelvis", "skull", "tail_vertebrae", "teeth", "wing_bones");
        this.setHeadCubeName("Head");
        this.setScale(0.7F, 0.25F);
    }
}
