package examples.service;

import examples.domain.Client;
import examples.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by serhii on 01.11.14.
 */
@Transactional
@Service("client_service")
@Repository
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void saveClients(Iterable<Client> clients) {
        clientRepository.save(clients);
    }
}
