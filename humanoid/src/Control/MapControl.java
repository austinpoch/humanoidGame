/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import humanoidGame.Locations;
import humanoidGame.Scenes.SceneType;
import java.io.Serializable;
import java.util.Map;
import javafx.scene.Scene;

/**
 *
 * @author Austin Poch
 */
public class MapControl implements Serializable {

    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startProgramScene;
        startProgramScene = new Scene();
        startProgramScene.setDescription();
        scenes[SceneType.startProgram.ordinal()] = startProgramScene;
        
        return scenes;
    }

    static void moveActorsToStartingLocation(MapControl mapControl) {
        System.out.println("*** moveActorsToStartingLocation function called ***");
    }

    private int noOfRows;
    private int noOfColumns;
    private Locations[][] locations;
    
    public static MapControl createMap() {
        MapControl mapControl = new MapControl(20, 20);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(mapControl, scenes);
        
        return mapControl;
    }

    private MapControl(int noOfRows, int noOfColumns) {
        
        if (noOfRows < 1 || noOfColumns < 1){
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        this.locations = new Locations[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++){
            for (int column = 0; column < noOfColumns; column++){
                Locations location = new Locations();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                locations[row][column] = location;
            }
        }
            
    }

    
}
