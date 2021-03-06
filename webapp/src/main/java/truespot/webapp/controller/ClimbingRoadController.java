package truespot.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import truespot.business.contract.ClimbingRoadManager;
import truespot.business.dto.ClimbingRoadDTO;
import truespot.model.ClimbingRoad;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ClimbingRoadController {

    @Autowired
    private ClimbingRoadManager climbingRoadManager;


    @GetMapping(value="/road")
    public List<ClimbingRoad> getClimbingRoad(){
        return climbingRoadManager.findAllClimbingRoad();
    }

    @RequestMapping(value = "/road/getRoadByID", method = RequestMethod.GET)
    public ClimbingRoad getClimbingRoad(@RequestParam(name = "idRoad", defaultValue = "")  String idRoad) {
            return climbingRoadManager.getClimbingRoad(Long.valueOf(idRoad));
    }


    @RequestMapping(value = "/road/getAllByArea", method = RequestMethod.GET)
    public List<ClimbingRoad> getAllByArea(@RequestParam(name = "idArea", defaultValue = "")  String idArea){
        return climbingRoadManager.findAllClimbingRoadByIdArea(Long.valueOf(idArea));
    }

    @RequestMapping(value = "/road/getRoad", method = RequestMethod.GET)
    public ClimbingRoad getRoad(@RequestParam(name = "idArea", defaultValue = "") String idArea) {
        return climbingRoadManager.getClimbingRoad(Long.valueOf(idArea));
    }

    @PostMapping(value="/road")
    public ClimbingRoad createClimbingRoad(@RequestBody ClimbingRoadDTO climbingRoadDTO){
        return climbingRoadManager.saveClimbingRoad(climbingRoadDTO);
    }

    @RequestMapping(value = "/road/update", method = RequestMethod.PUT)
    public void updateClimbingRoad(@RequestBody ClimbingRoadDTO climbingRoadDTO) {
        climbingRoadManager.updateClimbingRoad(climbingRoadDTO);
    }
    @RequestMapping(value = "/road", method = RequestMethod.DELETE)
    public void deleteClimbingRoad(@RequestParam(name = "idRoad", defaultValue = "") String idRoad){
        climbingRoadManager.deleteClimbingRoad(Long.valueOf(idRoad)); }
}
