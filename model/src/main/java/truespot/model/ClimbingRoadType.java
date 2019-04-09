package truespot.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="climbing_road_type",schema="public" )
public enum  ClimbingRoadType implements Serializable {

    BLOC( null,"Bouldering", "Bloc"),
    VOIE(null,"Road","Voie"),
    GRANDEVOIE(null,"Big Road","Grande voie"),
    RELAIS(null,"Multi-Pich climbing","Relais"),
    FREE(null,"Free climbing","Escalade libre"),
    ClimbingRoadType(null,"DeepWater","Escalade maritime");


    @Id
    private ClimbingRoad climbingRoad;

    @Column(name="en")
    private String en;
    @Column(name="fr")
    private String fr;

    ClimbingRoadType(ClimbingRoad climbingRoad, String en, String fr) {
        this.climbingRoad = climbingRoad;
        this.en = en;
        this.fr = fr;
    }
}

