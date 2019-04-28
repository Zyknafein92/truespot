package truespot.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import truespot.business.contract.SpotManager;
import truespot.business.dto.mapper.SpotMapper;
import truespot.model.Spot;
import truespot.business.dto.SpotDTO;

import java.util.List;
import java.util.Optional;

@RestController
public class SpotController {

    @Autowired
    private SpotManager spotManager;
    @Autowired
    private SpotMapper spotMapper;

    @GetMapping(value="/spot")
    public List<Spot> getSpots(){
        return spotManager.findAllSpot();
    }

    @GetMapping(value="/spot/{id}")
    public SpotDTO getSpot(@PathVariable Long id) {
        Optional<Spot> spot = spotManager.getSpot(id);
        if(spot.isPresent()){
            Spot spotReal = spot.get();
            return spotMapper.objectToDTO(spotReal);
        }throw new RuntimeException("spot not found");
    }


    @PostMapping(value="/spot")
    public Spot createSpot(@RequestBody SpotDTO spotDTO){
        return spotMapper.dtoToObject(spotDTO);
    }


    @PutMapping(value = "/spot/{id}")
    public void updateSpot(@PathVariable Long id , @RequestBody Spot spot) {
        spotManager.updateSpot(id,spot);
    }


    @DeleteMapping(value= "/spot/{id}")
    public void deleteSpot(@PathVariable Long id){
        spotManager.deleteSpot(id);
    }
}
