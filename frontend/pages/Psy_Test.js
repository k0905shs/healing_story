import { Container, Nav, Table } from "react-bootstrap";
import Head from "next/head";
import { useState } from "react";

const Psy_Test = () => {
  const [activeTab, setActiveTab] = useState("1"); // 초기값은 첫번째 탭

  const handleTabSelect = (eventKey) => {
    setActiveTab(eventKey);
  };

  const despressionQues = [];

  return (
    <>
      <Head>
        <title>힐링 스토리 - 심리 검사</title>
        <meta
          name="description"
          content="현대인을 위한 마음 치유, 힐링 스토리 Healing Story, 심리검사"
        />
      </Head>
      <Container>
        <h1 style={{ marginTop: "20px" }}> 심리 검사</h1>
        <section style={{ marginTop: "20px" }}>
          <Nav
            fill
            variant="tabs"
            activeKey={activeTab} // 현재 선택된 탭
            onSelect={handleTabSelect} // 탭 선택 이벤트 핸들러
          >
            <Nav.Item>
              <Nav.Link eventKey="1">우울</Nav.Link>
            </Nav.Item>
            <Nav.Item>
              <Nav.Link eventKey="2">불안</Nav.Link>
            </Nav.Item>
            <Nav.Item>
              <Nav.Link eventKey="3">자살</Nav.Link>
            </Nav.Item>
            <Nav.Item>
              <Nav.Link eventKey="4">스트레스</Nav.Link>
            </Nav.Item>
          </Nav>
        </section>
        <section style={{ marginTop: "20px" }}>
          {activeTab === "1" && (
            <div>
              <h5>우울 자가진단</h5>
              <p>
                다음은 우울한 정도를 스스로 알아보기 위한 것입니다. <br />
                지난 2주간, 얼마나 자주 다음과 같은 문제들로 곤란을
                겪으셨습니까? <br />
                지난 2주 동안에 아래와 같은 생각을 한 날을 헤아려서 해당하는
                곳에 체크하세요.
              </p>
              <Table striped bordered hover>
                <thead>
                  <tr>
                    <th>문항</th>
                    <th>지난 2주 동안에</th>
                    <th>없음</th>
                    <th>2, 3일 이상</th>
                    <th>7일 이상</th>
                    <th>거의 매일</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>1</td>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                    <td>@mdo</td>
                  </tr>
                  <tr>
                    <td>2</td>
                    <td>Jacob</td>
                    <td>Thornton</td>
                    <td>@fat</td>
                    <td>@fat</td>
                    <td>@fat</td>
                  </tr>
                  <tr>
                    <td>3</td>
                    <td>Larry the Bird</td>
                    <td>@twitter</td>
                    <td>@twitter</td>
                    <td>@twitter</td>
                    <td>@twitter</td>
                  </tr>
                </tbody>
              </Table>
            </div>
          )}
          {activeTab === "2" && <div>불안에 대한 내용을 보여줍니다.</div>}
          {activeTab === "3" && <div>자살에 대한 내용을 보여줍니다.</div>}
          {activeTab === "4" && <div>스트레스에 대한 내용을 보여줍니다.</div>}
        </section>
      </Container>
    </>
  );
};

export default Psy_Test;
