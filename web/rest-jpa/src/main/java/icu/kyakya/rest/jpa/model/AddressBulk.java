package icu.kyakya.rest.jpa.model;

import icu.kyakya.rest.jpa.model.audit.AuditMetadata;
import icu.kyakya.rest.jpa.model.basic.Bulk;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Data
public class AddressBulk extends Bulk<Address> {
            // todo one to many
}
