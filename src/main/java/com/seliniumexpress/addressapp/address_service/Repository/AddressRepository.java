package com.seliniumexpress.addressapp.address_service.Repository;

import com.seliniumexpress.addressapp.address_service.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AddressRepository extends JpaRepository<Address,Integer> {

    @Query(nativeQuery = true, value = "select ad.Id, ad.Lane1, ad.Lane2, ad.State, ad.Zip from address ad JOIN employee emp\n" +
            "on ad.employee_id = emp.id\n" +
            "WHERE employee_id=:employeeId")
    Address findAddressByEmpId(@Param("employeeId") int employeeId);
}
