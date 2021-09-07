package david.augusto.luan.sgeservice.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceGenericEntity<E> {

    List<E> findAll();

    E save(E entity);

    E update(E dto);

    E getByIE(Long id);

    void delete(Long id);
}
