/**
 * FoodCraft Mod for Minecraft.
 * Copyright (C) 2016 Infinity Studio.
 * <p/>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @license GPLv3
 */
package org.infinitystudio.foodcraftreloaded.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.infinitystudio.foodcraftreloaded.block.*;
import org.infinitystudio.foodcraftreloaded.item.*;
import org.infinitystudio.foodcraftreloaded.utils.modmanagent.common.*;

public class FoodCraftRegistration {
    /**
     * 基础 Base
     */
    public static final CreativeTabs FcTabBase = new CreativeTabs("creativetabs.base") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(blockRice);
        }
    };

    /**
     * 植物&种子 Plants & Seeds
     */
    public static final CreativeTabs FcTabPlant = new CreativeTabs("creativetabs.plant") {
        @Override
        public Item getTabIconItem() {
            return itemBlackBean;
        }
    };

    /**
     * 饮品 Drinks
     */
    public static final CreativeTabs FcTabDrink = new CreativeTabs("creativetabs.drink") {
        @Override
        public Item getTabIconItem() {
            return itemFruitOrangeDrink;
        }
    };

    /**
     * 主食 Staple
     */
    public static final CreativeTabs FcTabStaple = new CreativeTabs("creativetabs.staple") {
        @Override
        public Item getTabIconItem() {
            return itemBlackBean;
        }
    };

    /**
     * 食材 Ingredient
     */
    public static final CreativeTabs FcTabIngredient = new CreativeTabs("creativetabs.ingredient") {
        @Override
        public Item getTabIconItem() {
            return itemBlackBean;
        }
    };

    /**
     * 小吃 Snack
     */
    public static final CreativeTabs FcTabSnack = new CreativeTabs("creativetabs.snack") {
        @Override
        public Item getTabIconItem() {
            return itemBlackBean;
        }
    };


    ////////////////////////////////////////////////////////////////
    // Block Registry
    // 方块注册
    ////////////////////////////////////////////////////////////////

    // Tree Registry
    // 树木注册

    // Tree Leaves Registry
    // 树叶注册
//    @ModBlock(name = "blockFruitTreeLeaves")
//    public static FruitTreeLeavesBlock blockFruitTreeLeaves;

    // Tree Logs Registry
    // 树干注册
//    @ModBlock(name = "blockFruitTreeLog")
//    public static FruitTreeBlock blockFruitTreeLog;

    // Tree Sapling Registry
    // 树苗注册
//    @ModBlock(name = "blockFruitTreeSapling")
//    public static FruitTreeSaplingBlock blockFruitTreeSapling;

    // Food Block Registry
    // 食物方块注册(用于储存&合成)
    @ModBlock(name = "blockRice")
    public static BaseBlock blockRice;

    // Seed Block Registry
    // 种子方块注册
//    @ModBlock(name = "blockCarrot")
    @ModVegetableBlock(name = "blockCarrot", seedName = "itemCarrot", cropName = "itemCarrot")
    public static VegetableBlock blockCarrot;

    // Bean Block Registry
    // 豆子种子方块注册
    @ModBeanBlock(type = ModBean.BeanType.Red)
    public static BeanBlock blockRedBean;

    @ModBeanBlock(type = ModBean.BeanType.Black)
    public static BeanBlock blockBlackBean;

    @ModBeanBlock(type = ModBean.BeanType.Green)
    public static BeanBlock blockGreenBean;

    @ModBeanBlock(type = ModBean.BeanType.Soy)
    public static BeanBlock blockSoybean;

    ////////////////////////////////////////////////////////////////
    // Item Registry
    // 物品注册
    ////////////////////////////////////////////////////////////////

    // Vegetable Registry
    // 蔬菜注册
//    @ModItem(name = "itemCarrot")
    @ModVegetable(name = "itemCarrot", satuation = 2.5f, oredicts = {"cropCarrot", "seedCarrot", "listAllseed", "listAllveggie"}, seedBlockName = "blockCarrot")
    public static VegetableItem carrot;

    // Bean Registry
    // 豆子注册
    @ModBean(type = ModBean.BeanType.Red)
    public static BeanItem itemRedBean;

    @ModBean(type = ModBean.BeanType.Black)
    public static BeanItem itemBlackBean;

    @ModBean(type = ModBean.BeanType.Green)
    public static BeanItem itemGreenBean;

    @ModBean(type = ModBean.BeanType.Soy)
    public static BeanItem itemSoyBean;

    @ModSprouts(type = ModBean.BeanType.Red)
    public static SproutsItem itemRedBeanSprouts;

    @ModSprouts(type = ModBean.BeanType.Black)
    public static SproutsItem itemBlackBeanSprouts;

    @ModSprouts(type = ModBean.BeanType.Green)
    public static SproutsItem itemGreenBeanSprouts;

    @ModSprouts(type = ModBean.BeanType.Soy)
    public static SproutsItem itemSoyBeanSprouts;

    // Food Registry
    // 食物注册

    // Fruit Registry
    // 水果注册
    @ModFruit(type = ModFruit.FruitType.Pear)
    public static FruitItem itemFruitPear;

    @ModFruit(type = ModFruit.FruitType.Litchi)
    public static FruitItem itemFruitLitchi;

    @ModFruit(type = ModFruit.FruitType.Peach)
    public static FruitItem itemFruitPeach;

    @ModFruit(type = ModFruit.FruitType.Orange)
    public static FruitItem itemFruitOrange;

    @ModFruit(type = ModFruit.FruitType.Mango)
    public static FruitItem itemFruitMango;

    @ModFruit(type = ModFruit.FruitType.Lemon)
    public static FruitItem itemFruitLemon;

    @ModFruit(type = ModFruit.FruitType.Grapefruit)
    public static FruitItem itemFruitGrapefruit;

    @ModFruit(type = ModFruit.FruitType.Persimmon)
    public static FruitItem itemFruitPersimmon;

    @ModFruit(type = ModFruit.FruitType.Papaya)
    public static FruitItem itemFruitPapaya;

    @ModFruit(type = ModFruit.FruitType.Hawthorn)
    public static FruitItem itemFruitHawthorn;

    @ModFruit(type = ModFruit.FruitType.Pomegranate)
    public static FruitItem itemFruitPomegranate;

    @ModFruit(type = ModFruit.FruitType.Date)
    public static FruitItem itemFruitDate;

    @ModFruit(type = ModFruit.FruitType.Cherry)
    public static FruitItem itemFruitCherry;

    @ModFruit(type = ModFruit.FruitType.Coconut)
    public static FruitItem itemFruitCoconut;

    @ModFruit(type = ModFruit.FruitType.Banana)
    public static FruitItem itemFruitBanana;


    // Juice Registry
    // 果汁注册
    @ModJuice(type = ModFruit.FruitType.Pear)
    public static JuiceItem itemFruitPearDrink;

    @ModJuice(type = ModFruit.FruitType.Litchi)
    public static JuiceItem itemFruitLitchiDrink;

    @ModJuice(type = ModFruit.FruitType.Peach)
    public static JuiceItem itemFruitPeachDrink;

    @ModJuice(type = ModFruit.FruitType.Orange)
    public static JuiceItem itemFruitOrangeDrink;

    @ModJuice(type = ModFruit.FruitType.Mango)
    public static JuiceItem itemFruitMangoDrink;

    @ModJuice(type = ModFruit.FruitType.Lemon)
    public static JuiceItem itemFruitLemonDrink;

    @ModJuice(type = ModFruit.FruitType.Grapefruit)
    public static JuiceItem itemFruitGrapefruitDrink;

    @ModJuice(type = ModFruit.FruitType.Persimmon)
    public static JuiceItem itemFruitPersimmonDrink;

    @ModJuice(type = ModFruit.FruitType.Papaya)
    public static JuiceItem itemFruitPapayaDrink;

    @ModJuice(type = ModFruit.FruitType.Hawthorn)
    public static JuiceItem itemFruitHawthornDrink;

    @ModJuice(type = ModFruit.FruitType.Pomegranate)
    public static JuiceItem itemFruitPomegranateDrink;

    @ModJuice(type = ModFruit.FruitType.Date)
    public static JuiceItem itemFruitDateDrink;

    @ModJuice(type = ModFruit.FruitType.Cherry)
    public static JuiceItem itemFruitCherryDrink;

    @ModJuice(type = ModFruit.FruitType.Coconut)
    public static JuiceItem itemFruitCoconutDrink;

    @ModJuice(type = ModFruit.FruitType.Banana)
    public static JuiceItem itemFruitBananaDrink;

    // Ice-cream Registry
    // 冰激凌注册
    @ModFood(name = "itemBaseIceCream", satuation = 2.0f, oredicts = {"foodIcecream", "listAllicecream"})
    public static FoodItem baseIceCream;

    @ModIcecream(type = ModFruit.FruitType.Pear)
    public static IcecreamItem itemFruitPearIcecream;

    @ModIcecream(type = ModFruit.FruitType.Litchi)
    public static IcecreamItem itemFruitLitchiIcecream;

    @ModIcecream(type = ModFruit.FruitType.Peach)
    public static IcecreamItem itemFruitPeachIcecream;

    @ModIcecream(type = ModFruit.FruitType.Orange)
    public static IcecreamItem itemFruitOrangeIcecream;

    @ModIcecream(type = ModFruit.FruitType.Mango)
    public static IcecreamItem itemFruitMangoIcecream;

    @ModIcecream(type = ModFruit.FruitType.Lemon)
    public static IcecreamItem itemFruitLemonIcecream;

    @ModIcecream(type = ModFruit.FruitType.Grapefruit)
    public static IcecreamItem itemFruitGrapefruitIcecream;

    @ModIcecream(type = ModFruit.FruitType.Persimmon)
    public static IcecreamItem itemFruitPersimmonIcecream;

    @ModIcecream(type = ModFruit.FruitType.Papaya)
    public static IcecreamItem itemFruitPapayaIcecream;

    @ModIcecream(type = ModFruit.FruitType.Hawthorn)
    public static IcecreamItem itemFruitHawthornIcecream;

    @ModIcecream(type = ModFruit.FruitType.Pomegranate)
    public static IcecreamItem itemFruitPomegranateIcecream;

    @ModIcecream(type = ModFruit.FruitType.Date)
    public static IcecreamItem itemFruitDateIcecream;

    @ModIcecream(type = ModFruit.FruitType.Cherry)
    public static IcecreamItem itemFruitCherryIcecream;

    @ModIcecream(type = ModFruit.FruitType.Coconut)
    public static IcecreamItem itemFruitCoconutIcecream;

    @ModIcecream(type = ModFruit.FruitType.Banana)
    public static IcecreamItem itemFruitBananaIcecream;

    // Soda Registry
    // 汽水注册
    @ModSoda(type = ModFruit.FruitType.Pear)
    public static SodaItem itemFruitPearSoda;

    @ModSoda(type = ModFruit.FruitType.Litchi)
    public static SodaItem itemFruitLitchiSoda;

    @ModSoda(type = ModFruit.FruitType.Peach)
    public static SodaItem itemFruitPeachSoda;

    @ModSoda(type = ModFruit.FruitType.Orange)
    public static SodaItem itemFruitOrangeSoda;

    @ModSoda(type = ModFruit.FruitType.Mango)
    public static SodaItem itemFruitMangoSoda;

    @ModSoda(type = ModFruit.FruitType.Lemon)
    public static SodaItem itemFruitLemonSoda;

    @ModSoda(type = ModFruit.FruitType.Grapefruit)
    public static SodaItem itemFruitGrapefruitSoda;

    @ModSoda(type = ModFruit.FruitType.Persimmon)
    public static SodaItem itemFruitPersimmonSoda;

    @ModSoda(type = ModFruit.FruitType.Papaya)
    public static SodaItem itemFruitPapayaSoda;

    @ModSoda(type = ModFruit.FruitType.Hawthorn)
    public static SodaItem itemFruitHawthornSoda;

    @ModSoda(type = ModFruit.FruitType.Pomegranate)
    public static SodaItem itemFruitPomegranateSoda;

    @ModSoda(type = ModFruit.FruitType.Date)
    public static SodaItem itemFruitDateSoda;

    @ModSoda(type = ModFruit.FruitType.Cherry)
    public static SodaItem itemFruitCherrySoda;

    @ModSoda(type = ModFruit.FruitType.Coconut)
    public static SodaItem itemFruitCoconutSoda;

    @ModSoda(type = ModFruit.FruitType.Banana)
    public static SodaItem itemFruitBananaSoda;
}
