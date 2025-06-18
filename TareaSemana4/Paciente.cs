using System;

namespace AgendaClinicaApp
{
    // Estructura para guardar información del paciente
    public struct Paciente
    {
        public string Cedula { get; set; }
        public string Nombre { get; set; }
        public string Motivo { get; set; }
        public string FechaTurno { get; set; }
        public string HoraTurno { get; set; }
    }
}
