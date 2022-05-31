package br.edu.utfpr.dv.sireata.factory;

import br.edu.utfpr.dv.sireata.model.*;

import br.edu.utfpr.dv.sireata.dao.*;


public enum FactoryDAO {

    F_ANEXODAO {
        @Override
        public AbstractDAO<Anexo> getInstance() { return new AnexoDAO(); }
    },

    F_ATADAO {
        @Override
        public AbstractDAO<Ata> getInstance() { return new AtaDAO(); }
    },

    F_ATAPARTICIPANTEDAO {
        @Override
        public AbstractDAO<AtaParticipante> getInstance() { return new AtaParticipanteDAO(); }
    },

    F_CAMPUSDAO {
        @Override
        public AbstractDAO<Campus> getInstance() { return new CampusDAO(); }
    },

    F_COMENTARIODAO {
        @Override
        public AbstractDAO<Comentario> getInstance() { return new ComentarioDAO(); }
    },

    F_DEPARTAMENTODAO {
        @Override
        public AbstractDAO<Departamento> getInstance() { return new DepartamentoDAO(); }
    },

    F_ORGAODAO {
        @Override
        public AbstractDAO<Orgao> getInstance() { return new OrgaoDAO(); }
    },

    F_PAUTADAO {
        @Override
        public AbstractDAO<Pauta> getInstance() { return new PautaDAO(); }
    },

    F_USUARIODAO {
        @Override
        public AbstractDAO<Usuario> getInstance() { return new UsuarioDAO(); }
    };

    public abstract AbstractDAO getInstance();

}