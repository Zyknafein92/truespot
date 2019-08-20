package truespot.business.impl;

import org.springframework.stereotype.Service;
import truespot.business.contract.AreaManager;
import truespot.business.dto.AreaDTO;
import truespot.business.dto.mapper.AreaMapper;
import truespot.model.Area;
import truespot.model.Topo;


import java.util.List;
import java.util.Optional;

@Service
public class AreaManagerImpl extends BusinessManagerImpl implements AreaManager {


    @Override
    public List<Area> findAllArea() {
        return getDaoFactory().getAreaRepository().findAll();
    }

    @Override
    public List<Area> findAllByIdTopo(Long idTopo) {
        return getDaoFactory().getAreaRepository().findAllByTopo(idTopo);
    }


    @Override
    public AreaDTO getArea(Long id) {
        Optional<Area> areaOptional = getDaoFactory().getAreaRepository().findById(id);
        Area area = null;
        if(areaOptional.isPresent()) {
            area = new Area(
                    areaOptional.get().getName(),
                    areaOptional.get().getDescription(),
                    areaOptional.get().getOrientation(),
                    areaOptional.get().getHeight()
            );
        }
        return area != null ? AreaMapper.objectToDTO(area) : null;
    }


    @Override
    public Area saveArea(AreaDTO areaDTO) {
       Topo topo = getDaoFactory().getTopoRepository().getOne(new Long(areaDTO.getIdTopo()));

        Area area = AreaMapper.DTOToObject(areaDTO);
        area.setTopo(topo);
        return getDaoFactory().getAreaRepository().save(area);
    }

    @Override
    public void updateArea(Long id, Area area) {
        AreaDTO areaDTO = getArea(id);
        AreaMapper.updateDTO(areaDTO, area);
        area.setId(id);
        getDaoFactory().getAreaRepository().save(area);
    }

    @Override
    public void deleteArea(Long id) { getDaoFactory().getAreaRepository().deleteById(id);}
}
