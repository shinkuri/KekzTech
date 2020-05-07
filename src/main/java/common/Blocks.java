package common;

import common.blocks.Block_ControlRod;
import common.blocks.Block_GDCUnit;
import common.blocks.Block_IchorJar;
import common.blocks.Block_ItemProxyCable;
import common.blocks.Block_ItemProxyEndpoint;
import common.blocks.Block_ItemProxySource;
import common.blocks.Block_ItemServerDrive;
import common.blocks.Block_ItemServerIOPort;
import common.blocks.Block_ItemServerRackCasing;
import common.blocks.Block_LapotronicEnergyUnit;
import common.blocks.Block_ReactorChamber_OFF;
import common.blocks.Block_ReactorChamber_ON;
import common.blocks.Block_TFFTCasing;
import common.blocks.Block_TFFTMultiHatch;
import common.blocks.Block_TFFTStorageFieldBlockT1;
import common.blocks.Block_TFFTStorageFieldBlockT2;
import common.blocks.Block_TFFTStorageFieldBlockT3;
import common.blocks.Block_TFFTStorageFieldBlockT4;
import common.blocks.Block_TFFTStorageFieldBlockT5;
import common.blocks.Block_ThaumiumReinforcedJar;
import common.blocks.Block_YSZUnit;
import net.minecraft.block.Block;

public class Blocks {
	
	public static Block yszUnit;
	public static Block gdcUnit;
	
	public static Block tfftCasing;
	public static Block tfftStorageField1;
	public static Block tfftStorageField2;
	public static Block tfftStorageField3;
	public static Block tfftStorageField4;
	public static Block tfftStorageField5;
	public static Block tfftMultiHatch;
	
	public static Block reactorChamberOFF;
	public static Block reactorChamberON;
	public static Block reactorControlRod;
	
	public static Block itemServerDrive;
	public static Block itemServerRackCasing;
	public static Block itemServerIOPort;
	
	public static Block itemProxyCable;
	public static Block itemProxySource;
	public static Block itemProxyEndpoint;
	
	public static Block jarThaumiumReinforced;
	public static Block jarIchor;
	
	public static Block lscLapotronicEnergyUnit;
	
	public static void init() {
		System.out.println("Registering blocks...");
		
		registerBlocks_SOFC();
		registerBlocks_TFFT();
		registerBlocks_Nuclear();
		//registerBlocks_ItemServer();
		//registerBlocks_ItemProxy();
		registerBlocks_Jars();
		registerBlocks_LSC();
		
		System.out.println("Finished registering blocks");
	}
	
	private static void registerBlocks_SOFC() {
		yszUnit = Block_YSZUnit.registerBlock();
		gdcUnit = Block_GDCUnit.registerBlock();
	}
	
	private static void registerBlocks_TFFT() {
		tfftCasing = Block_TFFTCasing.registerBlock();
		tfftStorageField1 = Block_TFFTStorageFieldBlockT1.registerBlock();
		tfftStorageField2 = Block_TFFTStorageFieldBlockT2.registerBlock();
		tfftStorageField3 = Block_TFFTStorageFieldBlockT3.registerBlock();
		tfftStorageField4 = Block_TFFTStorageFieldBlockT4.registerBlock();
		tfftStorageField5 = Block_TFFTStorageFieldBlockT5.registerBlock();
		tfftMultiHatch = Block_TFFTMultiHatch.registerBlock();
	}
	
	private static void registerBlocks_Nuclear() {
		reactorChamberOFF = Block_ReactorChamber_OFF.registerBlock();
		reactorChamberON = Block_ReactorChamber_ON.registerBlock();
		reactorControlRod = Block_ControlRod.registerBlock();
	}
	
	private static void registerBlocks_ItemServer() {
		itemServerDrive = Block_ItemServerDrive.registerBlock();
		itemServerRackCasing = Block_ItemServerRackCasing.registerBlock();
		itemServerIOPort = Block_ItemServerIOPort.registerBlock();
	}
	
	private static void registerBlocks_ItemProxy() {
		itemProxyCable = Block_ItemProxyCable.registerBlock();
		itemProxySource = Block_ItemProxySource.registerBlock();
		itemProxyEndpoint = Block_ItemProxyEndpoint.registerBlock();
	}
	
	private static void registerBlocks_Jars() {
		jarThaumiumReinforced = Block_ThaumiumReinforcedJar.registerBlock();
		jarIchor = Block_IchorJar.registerBlock();
	}
	
	private static void registerBlocks_LSC() {
		lscLapotronicEnergyUnit = Block_LapotronicEnergyUnit.registerBlock();
	}
}