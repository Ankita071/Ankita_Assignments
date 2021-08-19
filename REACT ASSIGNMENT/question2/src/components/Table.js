import React from "react";
import "./Table.css";

const Table = () => {
  const tableData = [
    { col1: "Name", col2: "Job" },
    { col1: "Charlie", col2: "Janitor" },
    { col1: "Mac", col2: "Bouncer" },
    { col1: "Dee", col2: "Aspiring actress" },
    { col1: "Dennis", col2: "Bartender" },
  ];

  const tab = tableData.map((t, index) => (
    <tr className={(t.col1 === "Name") ? "bold rows": "rows"} key={index}>
      <td className="columns" key={t.index}>
        {t.col1}
      </td>
      <td className="columns" key={t.index}>
        {t.col2}
      </td>
    </tr>
  ));

  return (
    <table>
      <tbody>{tab}</tbody>
    </table>
  );
};

export default Table;
