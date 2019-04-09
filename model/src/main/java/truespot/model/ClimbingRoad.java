package truespot.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name="climbing_road", schema="public")
public class ClimbingRoad implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long climbing_road_id;

    @Column(name="area_id")
    private Area area;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="difficulty")
    private Difficulty difficulty;

    @Enumerated(EnumType.STRING)
    @Column(name="climbing_road_type")
    private ClimbingRoadType type;

    public ClimbingRoad(Area area, String name, String description, Difficulty difficulty, ClimbingRoadType type) {
        this.area = area;
        this.name = name;
        this.description = description;
        this.difficulty = difficulty;
        this.type = type;
    }


    public ClimbingRoad(String name, String description) {
        this.name = name;
        this.description = description;
    }

}