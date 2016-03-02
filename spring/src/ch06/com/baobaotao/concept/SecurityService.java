package ch06.com.baobaotao.concept;

public interface SecurityService {
    boolean checkAccess(User user,String service);
}
