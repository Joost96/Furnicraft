package joost.furnicraft;

import joost.furnicraft.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Furnicraft
{
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Init
    public void init(FMLInitializationEvent event) {

    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {


    }
}
