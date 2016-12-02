package ni.org.ics.zip.domain;

import ni.org.ics.zip.domain.audit.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by FIRSTICT on 10/6/2016.
 * V1.0
 */
@Entity
@Table(name = "zp_reporte_us_salida", catalog = "zika_zip")
public class ZpControlReporteUSSalida extends BaseMetaData implements Auditable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigo;
	private Date fechaHoraSalida;
    private String lugarSalida;
    private String persona;

    @Id
    @Column(name="codigo", nullable = false, length = 50)
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Id
    @Column(name="fecha_salida", nullable = false)
    public Date getFechaHoraSalida() {
        return fechaHoraSalida;
    }
    public void setFechaHoraSalida(Date fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    @Column(name="lugar", nullable = false, length = 50)
	public String getLugarSalida() {
		return lugarSalida;
	}
	public void setLugarSalida(String lugarSalida) {
		this.lugarSalida = lugarSalida;
	}

    @Column(name="persona", nullable = false, length = 50)
	public String getPersona() {
		return persona;
	}
	public void setPersona(String persona) {
		this.persona = persona;
	}

    @Override
    public boolean isFieldAuditable(String fieldname) {
        return false;
    }
}
