package client.networking;

import shared.User;
import shared.util.Subject;

import java.util.List;

public interface Client extends Subject
{
  void listenToServer(User user);

  List<String> getUserList();
  boolean addUser(User user1);

  boolean login(User user);
}
