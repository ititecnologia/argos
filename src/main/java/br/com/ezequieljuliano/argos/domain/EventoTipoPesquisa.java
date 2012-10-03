/*
 * Copyright 2012 Ezequiel Juliano Müller.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.ezequieljuliano.argos.domain;

import br.com.ezequieljuliano.argos.constant.Constantes;
import javax.inject.Named;

/**
 *
 * @author Ezequiel Juliano Müller
 */
@Named
public enum EventoTipoPesquisa {

    etpTudo("Tudo"), etpEventoMensagem("Mensagem do Evento"), etpHostName("Nome do Host"),
    etpHostUser("Usuário do Host"), etpHostIp("IP do Host"), etpFonte("Fonte"),
    etpNome("Nome do Evento"), etpOcorrenciaDtHr("Data/Hora Ocorrência"), etpPalavrasChave("Palavras-Chave"),
    etpEntidadeNome("Entidade Nome"), etpEntidadeCadastroNacional("Entidade Cadastro Nacional"),
    etpEventoNivelDescricao("Nível de Evento Descrição"), etpEventoTipoDescricao("Tipo de Evento Descrição");
    
    private String nome;

    private EventoTipoPesquisa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getLuceneIndex() {
        switch (this) {
            case etpTudo:
                return Constantes.TUDO;
            case etpEventoMensagem:
                return Constantes.INDICE_EVENTO_MENSAGEM;
            case etpHostName:
                return Constantes.INDICE_HOST_NAME;
            case etpHostUser:
                return Constantes.INDICE_HOST_USER;
            case etpHostIp:
                return Constantes.INDICE_HOST_IP;
            case etpFonte:
                return Constantes.INDICE_FONTE;
            case etpNome:
                return Constantes.INDICE_NOME;
            case etpOcorrenciaDtHr:
                return Constantes.INDICE_OCORRENCIA_DTHR;
            case etpPalavrasChave:
                return Constantes.INDICE_PALAVRAS_CHAVE;
            case etpEntidadeNome:
                return Constantes.INDICE_ENTIDADE_NOME;
            case etpEntidadeCadastroNacional:
                return Constantes.INDICE_ENTIDADE_CADASTRONACIONAL;
            case etpEventoNivelDescricao:
                return Constantes.INDICE_EVENTO_NIVEL_DESCRICAO;
            case etpEventoTipoDescricao:
                return Constantes.INDICE_EVENTO_TIPO_DESCRICAO;
            default:
                return Constantes.TUDO;
        }
    }
}