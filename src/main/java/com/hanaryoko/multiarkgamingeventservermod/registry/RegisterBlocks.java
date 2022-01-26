package com.hanaryoko.multiarkgamingeventservermod.registry;

import com.hanaryoko.multiarkgamingeventservermod.blocks.EventBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegisterBlocks {

    public static final EventBlock DiscordNitro1M = new EventBlock("discord_nitro_1_month");
    public static final EventBlock DiscordNitro1Y = new EventBlock("discord_nitro_1_year");
    public static final EventBlock ShadowOfTheTombRaiderDefinitiveEdition = new EventBlock("shadow_of_the_tomb_raider_definitive_edition");
    public static final EventBlock MortalKombat11 = new EventBlock("mortal_kombat_11");
    public static final EventBlock TombRaiderGOTYEdition = new EventBlock("tomb_raider_goty_edition");
    public static final EventBlock Maneater = new EventBlock("maneater");
    public static final EventBlock BatmanArkhamKnightPremiumEdition = new EventBlock("batman_arkham_knight_premium_edition");
    public static final EventBlock BeyondTheWire = new EventBlock("beyond_the_wire");
    public static final EventBlock YookaLayleeAndTheImpossibleLair = new EventBlock("yooka_laylee_and_the_impossible_lair");
    public static final EventBlock RailwayEmpire = new EventBlock("railway_empire");
    public static final EventBlock RiseOfTheTombRaider20YearCelebration = new EventBlock("rise_of_the_tomb_raider_20_year_celebration");
    public static final EventBlock EndZoneAWorldApart = new EventBlock("endzone_a_world_apart");
    public static final EventBlock Partisans1941 = new EventBlock("partisans_1941");
    public static final EventBlock MORDHAU = new EventBlock("mordhau");
    public static final EventBlock LEGOWorlds = new EventBlock("lego_worlds");
    public static final EventBlock LEGOSTARWARSTheForceAwakensDeluxeEdition = new EventBlock("lego_star_wars_the_force_awakens_deluxe_edition");
    public static final EventBlock MortalKombatXL = new EventBlock("mortal_kombat_xl");
    public static final EventBlock _25DollarRunescapeEGiftcard = new EventBlock("25_dollar_runescape_egiftcard");
    public static final EventBlock TheSurvivalists = new EventBlock("the_survivalists");
    public static final EventBlock ProjectWingman = new EventBlock("project_wingman");
    public static final EventBlock DueProcess = new EventBlock("due_process");
    public static final EventBlock WrathAeonOfRuin = new EventBlock("wrath_aeon_of_ruin");
    public static final EventBlock DriftlandTheMagicRevival = new EventBlock("driftland_the_magic_revival");
    public static final EventBlock SmokeAndSacrifice = new EventBlock("smoke_and_sacrifice");
    public static final EventBlock GreakMemoriesOfAzur = new EventBlock("greak_memories_of_azur");
    public static final EventBlock JustCause3 = new EventBlock("just_cause_3");
    public static final EventBlock MobiusFront83 = new EventBlock("mobius_front_83");
    public static final EventBlock _8DoorsArumsAfterlifeAdventure = new EventBlock("8_doors_arums_afterlife_adventure");
    public static final EventBlock TurnipBoyCommitsTaxEvasion = new EventBlock("turnip_boy_commits_tax_evasion");
    public static final EventBlock BPMBulletsPerMinute = new EventBlock("bpm_bullets_per_minute");
    public static final EventBlock HouseFlipper = new EventBlock("house_flipper");
    public static final EventBlock Wingspan = new EventBlock("wingspan");
    public static final EventBlock BatmanArkhamAsylumGOTY = new EventBlock("batman_arkham_asylum_goty");
    public static final EventBlock BatmanArkhamCityGOTYEdition = new EventBlock("batman_arkham_city_goty_edition");
    public static final EventBlock BatmanArkhamKnight = new EventBlock("batman_arkham_knight");
    public static final EventBlock BatmanArkhamOriginsBlackgateDeluxeEdition = new EventBlock("batman_arkham_origins_blackgate_deluxe_edition");
    public static final EventBlock LEGOHarryPotterYears14 = new EventBlock("lego_harry_potter_years_1_4");
    public static final EventBlock LEGOHarryPotterYears57 = new EventBlock("lego_harry_potter_years_5_7");
    public static final EventBlock MiddleEarthShadowOfMordorGameOfTheYearEdition = new EventBlock("middle_earth_shadow_of_mordor_game_of_the_year_edition");
    public static final EventBlock Timelie = new EventBlock("timelie");
    public static final EventBlock LacunaASci_fiNoirAdventure = new EventBlock("lacuna_a_sci_fi_noir_adventure");
    public static final EventBlock Hue = new EventBlock("hue");
    public static final EventBlock XboxUltimateGamePass1Month = new EventBlock("xbox_ultimate_game_pass_1_month");
    public static final EventBlock Voidigo = new EventBlock("voidigo");
    public static final EventBlock PumpedBMXPro = new EventBlock("pumped_bmx_pro");
    public static final EventBlock FlingToTheFinish = new EventBlock("fling_to_the_finish");
    public static final EventBlock SimpleRockets2 = new EventBlock("simple_rockets_2");
    public static final EventBlock Tohu = new EventBlock("tohu");
    public static final EventBlock AndYetItMoves = new EventBlock("and_yet_it_moves");
    public static final EventBlock Turmoil = new EventBlock("turmoil");
    public static final EventBlock LOVE2Kuso = new EventBlock("love_2_kuso");
    public static final EventBlock KingsBountyWarriorsOfTheNorth = new EventBlock("kings_bounty_warriors_of_the_north");

    @SubscribeEvent
    public static void onBlockRegistry(final RegistryEvent.Register<Block> blockRegister){
        blockRegister.getRegistry().register(DiscordNitro1M);
        blockRegister.getRegistry().register(DiscordNitro1Y);
        blockRegister.getRegistry().register(ShadowOfTheTombRaiderDefinitiveEdition);
        blockRegister.getRegistry().register(MortalKombat11);
        blockRegister.getRegistry().register(TombRaiderGOTYEdition);
        blockRegister.getRegistry().register(Maneater);
        blockRegister.getRegistry().register(BatmanArkhamKnightPremiumEdition);
        blockRegister.getRegistry().register(BeyondTheWire);
        blockRegister.getRegistry().register(YookaLayleeAndTheImpossibleLair);
        blockRegister.getRegistry().register(RailwayEmpire);
        blockRegister.getRegistry().register(RiseOfTheTombRaider20YearCelebration);
        blockRegister.getRegistry().register(EndZoneAWorldApart);
        blockRegister.getRegistry().register(Partisans1941);
        blockRegister.getRegistry().register(MORDHAU);
        blockRegister.getRegistry().register(LEGOWorlds);
        blockRegister.getRegistry().register(LEGOSTARWARSTheForceAwakensDeluxeEdition);
        blockRegister.getRegistry().register(MortalKombatXL);
        blockRegister.getRegistry().register(_25DollarRunescapeEGiftcard);
        blockRegister.getRegistry().register(TheSurvivalists);
        blockRegister.getRegistry().register(ProjectWingman);
        blockRegister.getRegistry().register(DueProcess);
        blockRegister.getRegistry().register(WrathAeonOfRuin);
        blockRegister.getRegistry().register(DriftlandTheMagicRevival);
        blockRegister.getRegistry().register(SmokeAndSacrifice);
        blockRegister.getRegistry().register(GreakMemoriesOfAzur);
        blockRegister.getRegistry().register(JustCause3);
        blockRegister.getRegistry().register(MobiusFront83);
        blockRegister.getRegistry().register(_8DoorsArumsAfterlifeAdventure);
        blockRegister.getRegistry().register(TurnipBoyCommitsTaxEvasion);
        blockRegister.getRegistry().register(BPMBulletsPerMinute);
        blockRegister.getRegistry().register(HouseFlipper);
        blockRegister.getRegistry().register(Wingspan);
        blockRegister.getRegistry().register(BatmanArkhamAsylumGOTY);
        blockRegister.getRegistry().register(BatmanArkhamCityGOTYEdition);
        blockRegister.getRegistry().register(BatmanArkhamKnight);
        blockRegister.getRegistry().register(BatmanArkhamOriginsBlackgateDeluxeEdition);
        blockRegister.getRegistry().register(LEGOHarryPotterYears14);
        blockRegister.getRegistry().register(LEGOHarryPotterYears57);
        blockRegister.getRegistry().register(MiddleEarthShadowOfMordorGameOfTheYearEdition);
        blockRegister.getRegistry().register(Timelie);
        blockRegister.getRegistry().register(LacunaASci_fiNoirAdventure);
        blockRegister.getRegistry().register(Hue);
        blockRegister.getRegistry().register(XboxUltimateGamePass1Month);
        blockRegister.getRegistry().register(Voidigo);
        blockRegister.getRegistry().register(PumpedBMXPro);
        blockRegister.getRegistry().register(FlingToTheFinish);
        blockRegister.getRegistry().register(SimpleRockets2);
        blockRegister.getRegistry().register(Tohu);
        blockRegister.getRegistry().register(AndYetItMoves);
        blockRegister.getRegistry().register(Turmoil);
        blockRegister.getRegistry().register(LOVE2Kuso);
        blockRegister.getRegistry().register(KingsBountyWarriorsOfTheNorth);
    }

    @SubscribeEvent
    public static void onItemRegistry(final RegistryEvent.Register<Item> itemRegister){
        itemRegister.getRegistry().register(DiscordNitro1M.getItem());
        itemRegister.getRegistry().register(DiscordNitro1Y.getItem());
        itemRegister.getRegistry().register(ShadowOfTheTombRaiderDefinitiveEdition.getItem());
        itemRegister.getRegistry().register(MortalKombat11.getItem());
        itemRegister.getRegistry().register(TombRaiderGOTYEdition.getItem());
        itemRegister.getRegistry().register(Maneater.getItem());
        itemRegister.getRegistry().register(BatmanArkhamKnightPremiumEdition.getItem());
        itemRegister.getRegistry().register(BeyondTheWire.getItem());
        itemRegister.getRegistry().register(YookaLayleeAndTheImpossibleLair.getItem());
        itemRegister.getRegistry().register(RailwayEmpire.getItem());
        itemRegister.getRegistry().register(RiseOfTheTombRaider20YearCelebration.getItem());
        itemRegister.getRegistry().register(EndZoneAWorldApart.getItem());
        itemRegister.getRegistry().register(Partisans1941.getItem());
        itemRegister.getRegistry().register(MORDHAU.getItem());
        itemRegister.getRegistry().register(LEGOWorlds.getItem());
        itemRegister.getRegistry().register(LEGOSTARWARSTheForceAwakensDeluxeEdition.getItem());
        itemRegister.getRegistry().register(MortalKombatXL.getItem());
        itemRegister.getRegistry().register(_25DollarRunescapeEGiftcard.getItem());
        itemRegister.getRegistry().register(TheSurvivalists.getItem());
        itemRegister.getRegistry().register(ProjectWingman.getItem());
        itemRegister.getRegistry().register(DueProcess.getItem());
        itemRegister.getRegistry().register(WrathAeonOfRuin.getItem());
        itemRegister.getRegistry().register(DriftlandTheMagicRevival.getItem());
        itemRegister.getRegistry().register(SmokeAndSacrifice.getItem());
        itemRegister.getRegistry().register(GreakMemoriesOfAzur.getItem());
        itemRegister.getRegistry().register(JustCause3.getItem());
        itemRegister.getRegistry().register(MobiusFront83.getItem());
        itemRegister.getRegistry().register(_8DoorsArumsAfterlifeAdventure.getItem());
        itemRegister.getRegistry().register(TurnipBoyCommitsTaxEvasion.getItem());
        itemRegister.getRegistry().register(BPMBulletsPerMinute.getItem());
        itemRegister.getRegistry().register(HouseFlipper.getItem());
        itemRegister.getRegistry().register(Wingspan.getItem());
        itemRegister.getRegistry().register(BatmanArkhamAsylumGOTY.getItem());
        itemRegister.getRegistry().register(BatmanArkhamCityGOTYEdition.getItem());
        itemRegister.getRegistry().register(BatmanArkhamKnight.getItem());
        itemRegister.getRegistry().register(BatmanArkhamOriginsBlackgateDeluxeEdition.getItem());
        itemRegister.getRegistry().register(LEGOHarryPotterYears14.getItem());
        itemRegister.getRegistry().register(LEGOHarryPotterYears57.getItem());
        itemRegister.getRegistry().register(MiddleEarthShadowOfMordorGameOfTheYearEdition.getItem());
        itemRegister.getRegistry().register(Timelie.getItem());
        itemRegister.getRegistry().register(LacunaASci_fiNoirAdventure.getItem());
        itemRegister.getRegistry().register(Hue.getItem());
        itemRegister.getRegistry().register(XboxUltimateGamePass1Month.getItem());
        itemRegister.getRegistry().register(Voidigo.getItem());
        itemRegister.getRegistry().register(PumpedBMXPro.getItem());
        itemRegister.getRegistry().register(FlingToTheFinish.getItem());
        itemRegister.getRegistry().register(SimpleRockets2.getItem());
        itemRegister.getRegistry().register(Tohu.getItem());
        itemRegister.getRegistry().register(AndYetItMoves.getItem());
        itemRegister.getRegistry().register(Turmoil.getItem());
        itemRegister.getRegistry().register(LOVE2Kuso.getItem());
        itemRegister.getRegistry().register(KingsBountyWarriorsOfTheNorth.getItem());
    }

}