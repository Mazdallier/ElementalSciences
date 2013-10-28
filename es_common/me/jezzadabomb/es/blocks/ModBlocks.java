package me.jezzadabomb.es.blocks;

import me.jezzadabomb.es.blocks.machines.BlockConstructionPlate;
import me.jezzadabomb.es.blocks.machines.BlockGravityCompressor;
import me.jezzadabomb.es.blocks.machines.BlockHadronSensor;
import me.jezzadabomb.es.blocks.machines.BlockLaserEmitter;
import me.jezzadabomb.es.blocks.machines.BlockPowerConduit;
import me.jezzadabomb.es.blocks.machines.BlockPowerEmitter;
import me.jezzadabomb.es.blocks.machines.BlockProtonSensor;
import me.jezzadabomb.es.blocks.machines.BlockResearchTable;
import me.jezzadabomb.es.blocks.machines.BlockStorageChamber;
import me.jezzadabomb.es.items.ItemBlockChamber;
import me.jezzadabomb.es.items.ItemBlockPureColour;
import me.jezzadabomb.es.lib.BlockIds;
import me.jezzadabomb.es.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

    /* Mod block instances */
    public static Block strengthenedGlass;
    public static Block chamberBlock;
    public static Block chamberBlockdummy;
    public static Block stchamberBlock;
    public static Block rechamberBlock;
    public static Block pureColour;
    public static Block gravCompressor;
    public static Block colliderPipe;
    public static Block protonSensor;
    public static Block hadronSensor;
    public static Block laserEmitter;
    public static Block constructionPlate;
    public static Block powerConduit;
    public static Block storageChamber;
    public static Block powerEmitter;
    public static Block researchTable;

    public static void init() {

        strengthenedGlass = new BlockStrengthenedGlass(BlockIds.GLASS_VIEWER_DEFAULT, Strings.STRENGTHENED_GLASS);
        gravCompressor = new BlockGravityCompressor(BlockIds.GRAVITY_COMPRESSOR_DEFAULT, Strings.GRAVITY_COMPRESSOR);
        chamberBlock = new BlockChamber(BlockIds.CHAMBER_BLOCK_DEFAULT, Strings.CHAMBER_WALL);
        chamberBlockdummy = new BlockChamberDummy(BlockIds.CHAMBER_BLOCK_DUMMY_DEFAULT, Strings.CHAMBER_WALL_DUMMY);
        pureColour = new BlockPureColour(BlockIds.PURE_COLOUR_DEFAULT, Strings.PURE_COLOUR);
        colliderPipe = new BlockPipe(BlockIds.COLLIDER_PIPE_DEFAULT, Strings.COLLIDER_PIPE, 6);
        protonSensor = new BlockProtonSensor(BlockIds.PROTON_SENSOR_DEFAULT, Strings.PROTON_SENSOR);
        hadronSensor = new BlockHadronSensor(BlockIds.HADRON_SENSOR_DEFAULT, Strings.HADRON_SENSOR);
        laserEmitter = new BlockLaserEmitter(BlockIds.LASER_EMITTER_DEFAULT, Strings.LASER_EMITTER);
        constructionPlate = new BlockConstructionPlate(BlockIds.CONSTRUCTION_PLATE_DEFAULT, Strings.CONSTRUCTION_PLATE);
        powerConduit = new BlockPowerConduit(BlockIds.POWER_CONDUIT_DEFAULT, Strings.POWER_CONDUIT, 6);
        storageChamber = new BlockStorageChamber(BlockIds.STORAGE_CHAMBER_DEFAULT, Strings.STORAGE_CHAMBER);
        powerEmitter = new BlockPowerEmitter(BlockIds.POWER_EMITTER_DEFAULT, Strings.POWER_EMITTER);
        researchTable = new BlockResearchTable(BlockIds.RESEARCH_TABLE_DEFAULT, Strings.RESEARCH_TABLE);
        
        // Single Data Blocks
        GameRegistry.registerBlock(strengthenedGlass, Strings.STRENGTHENED_GLASS);
        GameRegistry.registerBlock(gravCompressor, Strings.GRAVITY_COMPRESSOR);
        GameRegistry.registerBlock(colliderPipe, Strings.COLLIDER_PIPE);
        GameRegistry.registerBlock(protonSensor, Strings.PROTON_SENSOR);
        GameRegistry.registerBlock(hadronSensor, Strings.HADRON_SENSOR);
        GameRegistry.registerBlock(laserEmitter, Strings.LASER_EMITTER);
        GameRegistry.registerBlock(constructionPlate, Strings.CONSTRUCTION_PLATE);
        GameRegistry.registerBlock(powerConduit, Strings.POWER_CONDUIT);
        GameRegistry.registerBlock(storageChamber, Strings.STORAGE_CHAMBER);
        GameRegistry.registerBlock(powerEmitter, Strings.POWER_EMITTER);
        GameRegistry.registerBlock(researchTable, Strings.RESEARCH_TABLE);

        // Meta Blocks
        GameRegistry.registerBlock(chamberBlock, ItemBlockChamber.class, Strings.CHAMBER_WALL);
        GameRegistry.registerBlock(chamberBlockdummy, ItemBlockChamber.class, Strings.CHAMBER_WALL_DUMMY);
        GameRegistry.registerBlock(pureColour, ItemBlockPureColour.class, Strings.PURE_COLOUR);
        //GameRegistry.registerBlock(strengthenedGlass, ItemBlockGlass.class, Strings.STRENGTHENED_GLASS);

        // Recipes
        initBlockRecipes();
    }

    private static void initBlockRecipes() {

        GameRegistry.addRecipe(new ItemStack(strengthenedGlass), new Object[] { "iii", 
                                                                                "isi",
                                                                                "iii", 
                                                                                Character.valueOf('i'), Block.glass,
                                                                                Character.valueOf('s'), Block.stone });
        GameRegistry.addRecipe(new ItemStack(chamberBlock), new Object[] {  "isi",
                                                                            "sis",
                                                                            "isi", 
                                                                            Character.valueOf('i'), Item.ingotIron,
                                                                            Character.valueOf('s'), Block.stone });

    }
}