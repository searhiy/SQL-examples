package examples.service;

import examples.domain.Client;
import examples.domain.Group;

import java.util.List;

/**
 * Created by serhii on 27.01.15.
 */
public interface GroupService {

    public void saveGroups(Iterable<Group> orders);

    public void assignRandomClientToRandomGroup(List<Group> groups, List<Client> clients);
}
