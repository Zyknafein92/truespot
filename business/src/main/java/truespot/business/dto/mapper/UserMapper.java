package truespot.business.dto.mapper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import truespot.business.contract.UserManager;
import truespot.model.User;
import truespot.business.dto.UserDTO;

import java.util.Optional;

@Component
public class UserMapper {

    @Autowired
    private UserManager userManager;

     public static UserDTO objectToDTO (User user) {

         UserDTO userDTO = new UserDTO();


         userDTO.setFirstName(user.getFirstName() != null ? user.getFirstName() : userDTO.getFirstName());
         userDTO.setLastName(user.getLastName() != null ? user.getLastName() : userDTO.getLastName());
         userDTO.setAge(user.getAge() != 0 ? user.getAge() : userDTO.getAge());
         userDTO.setGender(user.getGender() != null ? user.getGender() : userDTO.getGender());
         userDTO.setPseudo(user.getPseudo() != null ? user.getPseudo() : userDTO.getPseudo());
         userDTO.setPassword(user.getPassword() != null ? user.getPassword() : userDTO.getPassword());
         userDTO.setEmail(user.getEmail() != null ? user.getEmail() : userDTO.getEmail());
         userDTO.setPhoneNumber(user.getPhoneNumber() != null ? user.getPhoneNumber() : userDTO.getPhoneNumber());


         return userDTO;
     }

     public static User dtoToObject (UserDTO userDTO){

         User user = new User();

         user.setFirstName(userDTO.getFirstName() != null ? userDTO.getFirstName() : user.getFirstName());
         user.setLastName(userDTO.getLastName() != null ? userDTO.getLastName() : user.getLastName());
         user.setAge(userDTO.getAge() != 0 ? userDTO.getAge() : user.getAge());
         user.setGender(userDTO.getGender() != null ? userDTO.getGender() : user.getGender());
         user.setPseudo(userDTO.getPseudo() != null ? userDTO.getPseudo() : user.getPseudo());
         user.setPassword(userDTO.getPassword() != null ? userDTO.getPassword() : user.getPassword());
         user.setEmail(userDTO.getEmail() != null ? userDTO.getEmail() : user.getEmail());
         user.setPhoneNumber(userDTO.getPhoneNumber() != null ? userDTO.getPhoneNumber() : user.getPhoneNumber());
        // user.setAdmin(userDTO.setIsAdmin(false));
         userDTO.setId(user.getId());

         return user;
     }

     public static UserDTO updateDTO(UserDTO userDTO, User user){

         userDTO.setFirstName(user.getFirstName() != null ? user.getFirstName() : userDTO.getFirstName());
         userDTO.setLastName(user.getLastName() != null ? user.getLastName() : userDTO.getLastName());
         userDTO.setAge(user.getAge() != 0 ? user.getAge() : userDTO.getAge());
         userDTO.setGender(user.getGender() != null ? user.getGender() : userDTO.getGender());
         userDTO.setPseudo(user.getPseudo() != null ? user.getPseudo() : userDTO.getPseudo());
         userDTO.setPassword(user.getPassword() != null ? user.getPassword() : userDTO.getPassword());
         userDTO.setEmail(user.getEmail() != null ? user.getEmail() : userDTO.getEmail());
         userDTO.setPhoneNumber(user.getPhoneNumber() != null ? user.getPhoneNumber() : userDTO.getPhoneNumber());

        return userDTO;
     }

}
