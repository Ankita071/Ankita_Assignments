var fullName = {
   firstName: "Ankita",
   lastName: "A"
};

document.write(fullName.firstName + "<br />");
document.write(fullName.lastName + "<br />");

// It will show undefined because middleName property is not defined above.
document.write(fullName.middleName + "<br />");

fullName.middleName = "M";
document.write(fullName.middleName + "<br />");
