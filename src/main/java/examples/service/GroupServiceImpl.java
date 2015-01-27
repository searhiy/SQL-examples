package examples.service;

import examples.domain.Client;
import examples.domain.Group;
import examples.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by serhii on 27.01.15.
 */
@Service(value = "groupService")
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public void saveGroups(Iterable<Group> orders) {
        groupRepository.save(orders);
    }

    @Override
    public void assignRandomClientToRandomGroup(List<Group> groups, List<Client> clients) {
        for (Group group : groups) {
            Random random = new Random();
            int clientN = random.nextInt(clients.size());
            for (int i = 0; i <= clientN; i++) {
                Collections.shuffle(clients);
                group.addClient(clients.get(random.nextInt(clients.size())));
            }
        }
    }
}
