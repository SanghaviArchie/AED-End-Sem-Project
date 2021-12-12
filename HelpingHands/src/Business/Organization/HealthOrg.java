/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HealthRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class HealthOrg extends Organisation{
    public HealthOrg() {
        super(Organisation.Type.Health.getOrgType());
    }
    
    @Override
    public ArrayList<Role> getRoleList() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HealthRole());
        return roles;
    }
}
