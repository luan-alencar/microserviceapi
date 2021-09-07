package david.augusto.luan.sgeservice.service.mapper;

import java.util.List;

public interface EntiyMapper<E, D> {

    E toEntity(D dto);

    D toDTO(E entity);

    List<E> toEntityList(List<D> listDTO);

    List<D> toListDTO(List<E> listEntity);
}
