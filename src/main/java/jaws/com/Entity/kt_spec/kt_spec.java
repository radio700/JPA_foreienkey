package jaws.com.Entity.kt_spec;

import jakarta.persistence.*;
import jaws.com.Entity.kt_pbl_bom.kt_pbl_bom;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@IdClass(kt_spec_pk.class)
@Table(name = "KT_SPEC")
public class kt_spec {
    @Id
    @Column(name = "ACFTC")
    private String acftc;

    @Id
    @Column(name = "PN")
    private String pn;

    @Id
    @Column(name = "CAGE")
    private String cage;

    @Column(name = "NOG_KOR")
    private String nogKor;

    @Column(name = "NOG_ENG")
    private String nogEng;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kt_spec")
//    private List<kt_pbl_bom> ktPblBoms;
}
