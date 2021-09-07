package david.augusto.luan.sgeservice.service;

import java.util.List;

public interface ServiceGenericEntity<E, D> {

    List<D> findAll();

    D save(E entity);

    D update(D dto);

    D getByID(Long id);

    void delete(Long id);
}
