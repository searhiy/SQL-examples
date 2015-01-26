package examples.util.processors;

import examples.domain.Client;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 01.11.14.
 */
public class ClientProcessor implements DataProcessor {

    private List<Client> clients = new ArrayList<>();

    @Override
    public void processData(String[] data) {
        //Collections.shuffle(addresses);
        Client client = new Client.Builder().
                setName(data[0]).
                setSurname(data[1]).
                build();
        clients.add(client);
    }

    @Override
    public List<?> getData() {
        return clients;
    }
}
