package truespot.business.contract;


import truespot.business.dto.TopoDTO;
import truespot.business.dto.TopoDTOContext;
import truespot.model.Topo;

import java.util.List;

public interface TopoManager {

    List<Topo> findAllTopo();

    List<Topo> findAllByUser_Pseudo(String pseudo);

    List<Topo> findAllByDepartment_Id(Long id);

    List<Topo> findAllShareTopoByUser (Long id);

    List<Topo> searchCriteres(Long idDepartment, String avaible, String type);

    TopoDTO getTopo(Long id);

    Topo saveTopo(TopoDTOContext topoDTOContext);

    void updateTopo(TopoDTO topoDTO);

    void updateShareTopo(TopoDTO topoDTO);

    void deleteTopo(Long id);
}
