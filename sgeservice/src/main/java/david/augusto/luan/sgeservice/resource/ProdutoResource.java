package david.augusto.luan.sgeservice.resource;

import david.augusto.luan.sgeservice.service.ProdutoService;
import david.augusto.luan.sgeservice.service.dto.ProdutoDTO;
import david.augusto.luan.sgeservice.service.mapper.ProdutoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
@RequiredArgsConstructor
public class ProdutoResource {

    private final ProdutoService service;
    private final ProdutoMapper mapper;

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> findAll() {
        return ResponseEntity.ok(mapper.toListDTO(service.findAll()));
    }
}
