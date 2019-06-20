package com.example.gttrader.ViewModel;
import com.example.gttrader.Entity.BobbyDodd;
import com.example.gttrader.Entity.COC;
import com.example.gttrader.Entity.CRC;
import com.example.gttrader.Entity.CULC;
import com.example.gttrader.Entity.DifficultyLevel;
import com.example.gttrader.Entity.FreshmanDorms;
import com.example.gttrader.Entity.GreekHouses;
import com.example.gttrader.Entity.NorthAveDinning;
import com.example.gttrader.Entity.Ore;
import com.example.gttrader.Entity.Player;
import com.example.gttrader.Entity.StudentCenter;
import com.example.gttrader.Entity.TechSquare;
import com.example.gttrader.Entity.TechTower;


public class ConfigurationViewModel {
    public static boolean addUpToSixteen(int pilot, int engineer, int fighter, int trader) {
        return (pilot + engineer + fighter + trader == 16);
    }

    public static void initNewPlayer(int pilot, int engineer, int fighter, int trader, String name) {
        Player player = new Player(name, pilot, engineer, fighter, trader);
        System.out.println(player);
    }

    public static void makeRegions() {
        BobbyDodd bobby_dodd = new BobbyDodd();
        COC coc = new COC();
        CRC crc = new CRC();
        CULC culc = new CULC();
        FreshmanDorms freshmanDorms = new FreshmanDorms();
        GreekHouses greekHouses = new GreekHouses();
        NorthAveDinning northAveDinning = new NorthAveDinning();
        StudentCenter studentCenter = new StudentCenter();
        TechSquare techSquare = new TechSquare();
        TechTower techTower = new TechTower();

        System.out.println(bobby_dodd + "\n" + coc + "\n" + crc + "\n" + culc + "\n" + freshmanDorms + "\n" + greekHouses
        + "\n" + northAveDinning + "\n" + studentCenter + "\n" + techSquare + "\n" + techTower);

    }
}
