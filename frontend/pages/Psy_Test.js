import { Container, Nav, Table, Button } from "react-bootstrap";
import Head from "next/head";
import { useState } from "react";

const Psy_Test = () => {
  const [activeTab, setActiveTab] = useState("1"); // 초기값은 첫번째 탭

  const handleTabSelect = (eventKey) => {
    setActiveTab(eventKey);
  };

  const scoreChoices = [
    {
      id: 1,
      result: "없음",
    },
    {
      id: 2,
      result: "2, 3일 이상",
    },
    {
      id: 3,
      result: "7일 이상",
    },
    {
      id: 4,
      result: "거의 매일",
    },
  ];
  const surveyQuestions = [
    {
      id: 1,
      question: "기분이 가라앉거나, 우울하거나, 희망이 없다고 느꼈다.",
      scoreChoices,
    },
    {
      id: 2,
      question: "기분이 가라앉거나, 우울하거나, 희망이 없다고 느꼈다.",
      scoreChoices,
    },
    {
      id: 3,
      question: "기분이 가라앉거나, 우울하거나, 희망이 없다고 느꼈다.",
      scoreChoices,
    },
    {
      id: 4,
      question: "기분이 가라앉거나, 우울하거나, 희망이 없다고 느꼈다.",
      scoreChoices,
    },
    {
      id: 5,
      question: "기분이 가라앉거나, 우울하거나, 희망이 없다고 느꼈다.",
      scoreChoices,
    },
    {
      id: 6,
      question: "기분이 가라앉거나, 우울하거나, 희망이 없다고 느꼈다.",
      scoreChoices,
    },
    {
      id: 7,
      question: "기분이 가라앉거나, 우울하거나, 희망이 없다고 느꼈다.",
      scoreChoices,
    },
    {
      id: 8,
      question: "기분이 가라앉거나, 우울하거나, 희망이 없다고 느꼈다.",
      scoreChoices,
    },
    {
      id: 9,
      question: "기분이 가라앉거나, 우울하거나, 희망이 없다고 느꼈다.",
      scoreChoices,
    },
  ];

  const [surveyScores, setSurveyScores] = useState([]);

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
                    <th>질문</th>
                    <th>응답</th>
                  </tr>
                </thead>
                <tbody>
                  {surveyQuestions.map((question, index) => (
                    <tr key={index}>
                      <td>{index + 1}</td>
                      <td>{question.question}</td>
                      <td>
                        {question.scoreChoices.map((scoreChoice, i) => (
                          <div key={i} className="form-check">
                            <input
                              type="radio"
                              name={`question-${index}`}
                              value={scoreChoice.id}
                              onChange={(event) => {
                                const newSurveyScores = [...surveyScores];
                                newSurveyScores[index] = [
                                  question.id,
                                  parseInt(event.target.value),
                                ];
                                setSurveyScores(newSurveyScores);
                              }}
                            />
                            <label className="form-check-label">
                              {scoreChoice.result}
                            </label>
                          </div>
                        ))}
                      </td>
                    </tr>
                  ))}
                </tbody>
              </Table>
              <Button
                className="btn btn-primary"
                onClick={() => {
                  const surveyResults = surveyScores.filter((id) => id != null);
                  console.log(surveyResults);
                }}
              >
                Submit
              </Button>
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
