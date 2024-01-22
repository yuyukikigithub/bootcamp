package com.vtnlab.bootcamp.lomboks;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode
@SuperBuilder
public class Developer extends Staff{
    private List<String> skills;

    public Developer(String name, int id, List<String> skills){
        super(id,name);
        this.skills=skills;
    }

    public static void main(String[] args) {
        Developer dev=new Developer();
        dev.setSkills(null);
        System.out.println(dev.getSkills());

        Developer dev2 = new Developer(new ArrayList<>(List.of("coding", "testing")));
        System.out.println(dev2); //Developer(skills=[coding, testing])
        System.out.println(dev2); //Developer(super=com.vtnlab.bootcamp.Developer@e35c9fe2, skills=[coding, testing])
        
        //after staff getter setter
        dev2.setId(1);//after @ToString in staff
        dev2.getId();
        //after @ToString(callSuper = true) in Developer
        //Developer(super=Staff(id=0, name=null), skills=[coding, testing])

        Developer dev3=Developer.builder()
                        .id(1)
                        .name("Amy")
                        .skills(new ArrayList<>(List.of("coding","admin")))
                        .build();
        Developer dev4=Developer.builder()
                        .id(1)
                        .name("Amy")
                        .skills(new ArrayList<>(List.of("coding","admin")))
                        .build();
        System.out.println(dev3.equals(dev4));

        System.out.println(dev3.hashCode());
        System.out.println(dev4.hashCode());
        
    }
}
