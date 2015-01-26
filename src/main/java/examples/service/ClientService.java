package examples.service;

import examples.domain.Client;

/**
 * Created by serhii on 01.11.14.
 */
public interface ClientService {

    public void saveClients(Iterable<Client> customer);
}
