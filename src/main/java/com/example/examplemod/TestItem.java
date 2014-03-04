package com.example.examplemod;

import cpw.mods.fml.common.Optional;
import cpw.mods.fml.relauncher.Side;
import mods.battlegear2.api.PlayerEventChild;
import mods.battlegear2.api.weapons.IBattlegearWeapon;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

/**
 * Created by Olivier on 04/03/14.
 */
@Optional.Interface(iface = "mods.battlegear2.api.weapons.IBattlegearWeapon", modid = "battlegear2", striprefs = true)
public class TestItem extends Item implements IBattlegearWeapon{
    public TestItem(int id){
        super(id);
        setUnlocalizedName("test:example");
        setTextureName("test:example");
    }
    @Override
    public boolean allowOffhand(ItemStack stack, ItemStack stack2) {
        return false;
    }

    @Override
    public boolean isOffhandHandDual(ItemStack stack) {
        return false;
    }

    @Override
    public boolean offhandAttackEntity(PlayerEventChild.OffhandAttackEvent offhandAttackEvent, ItemStack stack, ItemStack stack2) {
        return false;
    }

    @Override
    public boolean offhandClickAir(PlayerInteractEvent playerInteractEvent, ItemStack stack, ItemStack stack2) {
        return false;
    }

    @Override
    public boolean offhandClickBlock(PlayerInteractEvent playerInteractEvent, ItemStack stack, ItemStack stack2) {
        return false;
    }

    @Override
    public void performPassiveEffects(Side side, ItemStack stack, ItemStack stack2) {

    }

    @Override
    public boolean sheatheOnBack(ItemStack stack) {
        return false;
    }
}
