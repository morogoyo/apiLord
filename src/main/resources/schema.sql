CREATE TABLE IF NOT EXISTS apilord.measurements
(
    id       int,
    comments varchar(255),
    subject  varchar(255),
    length   int,
    area     int,
    count    int
);


CREATE TABLE IF NOT EXISTS apilord.user_roof_data
(

    id                 int,
    brand              varchar(255),
    warranty           varchar(255),
    attachment         varchar(255),
    insulationValue    varchar(255),
    deckType           varchar(255),
    membrane_thickness int,
    deck_area          int,
    parapet_area       int,
    rtuLF              int,
    outsideCorners     int,
    copingStretch      int,
    copingLF           int,
    downSpoutLF        int,
    collectorHeads     int,
    membraneStretch    int,
    pitchPockets       int,
    closeBoot          int,
    splitBoot          int,
    drains             int,
    vents              int,
    walkpads           int
);

