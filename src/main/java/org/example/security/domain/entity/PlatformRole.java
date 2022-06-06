package org.example.security.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Data
public class PlatformRole extends BaseEntity {

    @Id
    private Long id;
    private String roleName;

}
